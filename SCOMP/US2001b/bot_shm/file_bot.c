#include "file_bot.h"
#include "shared_memory.h"
#include "shared.h"
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <dirent.h>
#include <signal.h>
#include <string.h>
#include <sys/wait.h>
#include <fcntl.h>
#include <sys/mman.h>
#include <semaphore.h>

//Prototipos das funções que serão implementadas
int check_for_new_files(const char *input_path);
void distribute_files(shared_memory *shm_ptr, config *config, sem_t *job_sem_id);


// Variável global para controlar a terminação
volatile sig_atomic_t should_terminate = 0;

// Função para executar o watcher
pid_t run_watcher(config *config, shared_memory *shm_ptr, sem_t *sem_id) {
    pid_t pid = fork();
    if (pid == -1) {
        perror("Impossível criar o processo watcher");
        exit(EXIT_FAILURE);
    }

    if (pid == 0) { // Processo filho (watcher)
        while (should_terminate == 0) { // Adicionado controle para should_terminate
            printf("[Monitor] Procurando novos ficheiros\n");
            int found_new_files = check_for_new_files(config->input_path);

            if (found_new_files) {
                printf("[Monitor] Novos ficheiros encontrados\n");
                sem_wait(sem_id);
                printf("[Monitor] Semáforo adquirido\n");

                // Adiciona novos trabalhos ao buffer circular
                DIR *dir = opendir(config->input_path);
                if (dir == NULL) {
                    perror("Erro ao abrir o diretório");
                    sem_post(sem_id);
                    continue;
                }

                struct dirent *entry;
                while ((entry = readdir(dir)) != NULL) {
                    if (entry->d_type == DT_REG) {
                        int prefix;
                        if (sscanf(entry->d_name, "%d-", &prefix) == 1) {
                            if (shm_ptr->job_queue.count < BUFFER_SIZE) {
                                shm_ptr->job_queue.buffer[shm_ptr->job_queue.tail].prefix = prefix;
                                strncpy(shm_ptr->job_queue.buffer[shm_ptr->job_queue.tail].file_name, entry->d_name, MAX_PATH_LENGTH);
                                shm_ptr->job_queue.tail = (shm_ptr->job_queue.tail + 1) % BUFFER_SIZE;
                                shm_ptr->job_queue.count++;
                                printf("[Monitor] Arquivo adicionado ao buffer: %s\n", entry->d_name);
                            } else {
                                printf("[Monitor] Buffer circular cheio, não é possível adicionar mais trabalhos\n");
                            }
                        }
                    }
                }
                closedir(dir);
                sem_post(sem_id);
                printf("[Monitor] Semáforo liberado\n");
            }

            sleep(config->watcher_interval);
        }
        printf("[Monitor] Terminando\n");
        exit(EXIT_SUCCESS);
    }

    return pid;
}

// Função para executar o processo pai
void run_parent(worker *workers, pid_t watcher_pid, config *config, shared_memory *shm_ptr, sem_t *sem_id, sem_t *job_sem_id) {
    while (should_terminate == 0) {

        sem_wait(sem_id);
        distribute_files(shm_ptr, config, job_sem_id);
        sem_post(sem_id);

        for (int i = 0; i < config->number_of_workers; i++) {
            if (shm_ptr->worker_is_busy[i] == 0 && workers[i].is_busy) {
                workers[i].is_busy = 0;
                printf("[Pai] Trabalhador %d acabou o trabalho\n", i);
            }
        }

        sleep(1);
    }
    generate_report(shm_ptr, config);
    terminate(workers, watcher_pid, config, shm_ptr, sem_id, job_sem_id);
}

// Função para configurar o handler para SIGINT
void setup_sigint_handler() {
    struct sigaction act;
    memset(&act, 0, sizeof(struct sigaction));
    act.sa_handler = handle_sigint;
    sigaction(SIGINT, &act, NULL);
}

// Handler para SIGINT
void handle_sigint(int signal) {
    (void)signal;  // Suprime o aviso de parâmetro não utilizado
    should_terminate = 1;
}

// Função para gerar o relatório
void generate_report(shared_memory *shm_ptr, config *config) {
    char report_path[MAX_PATH_LENGTH + 12]; // Ajustar tamanho para evitar truncamento
    snprintf(report_path, sizeof(report_path), "%s/report.csv", config->output_path); // Usar snprintf para evitar truncamento

    printf("[Pai] Gerando o relatório %s\n", report_path);

    FILE *file = fopen(report_path, "a");
    if (file == NULL) {
        perror("Erro ao abrir o arquivo de relatório");
        return;
    }

    for (int i = 0; i < shm_ptr->jobs_length; i++) {
        job job = shm_ptr->jobs[i];

        for (int j = 0; j < job.length; j++) {
            fprintf(file, "%d,%s,%s\n", job.prefix, job.output_directory, job.copied_files[j]);
        }
    }

    fclose(file);
}

// Função para terminar o processo
void terminate(worker *workers, pid_t watcher_pid, config *config, shared_memory *shm_ptr, sem_t *sem_id, sem_t *job_sem_id) {
    printf("[Pai] Terminando watcher\n");
    kill(watcher_pid, SIGTERM);
    waitpid(watcher_pid, NULL, 0);

    printf("[Pai] Desassociar e remover memória partilhada\n");
    munmap(shm_ptr, sizeof(shared_memory));
    shm_unlink("/file_bot_shm");

    printf("[Pai] Removendo semáforos\n");
    sem_close(sem_id);
    sem_unlink("/file_bot_sem");
    sem_close(job_sem_id);
    sem_unlink("/file_bot_job_sem");

    printf("[Pai] Terminando trabalhadores\n");
    for (int i = 0; i < config->number_of_workers; i++) {
        kill(workers[i].pid, SIGTERM);
        waitpid(workers[i].pid, NULL, 0);
    }
}

// Função para verificar novos arquivos
int check_for_new_files(const char *input_path) {
    DIR *dir = opendir(input_path);
    if (dir == NULL) {
        perror("Erro ao abrir o diretório");
        return 0;
    }

    struct dirent *entry;
    while ((entry = readdir(dir)) != NULL) {
        if (entry->d_type == DT_REG) { // Se é um arquivo regular
            closedir(dir);
            return 1; // Novo arquivo encontrado
        }
    }

    closedir(dir);
    return 0; // Nenhum novo arquivo encontrado
}

// Função para distribuir arquivos entre os trabalhadores
void distribute_files(shared_memory *shm_ptr, config *config, sem_t *job_sem_id) {
    if (shm_ptr->job_queue.count > 0) {
        job_item next_job = shm_ptr->job_queue.buffer[shm_ptr->job_queue.head];
        shm_ptr->job_queue.head = (shm_ptr->job_queue.head + 1) % BUFFER_SIZE;
        shm_ptr->job_queue.count--;

        // Procura um worker disponível e atribui o trabalho
        for (int i = 0; i < config->number_of_workers; i++) {
            if (shm_ptr->worker_is_busy[i] == 0) {
                shm_ptr->distributed_prefixes[i] = next_job.prefix;
                shm_ptr->worker_is_busy[i] = 1;
                printf("[Pai] Associando prefixo %d ao trabalhador %d\n", next_job.prefix, i);
                sem_post(job_sem_id); // Sinaliza que há um novo trabalho disponível
                break;
            }
        }
    }
}
