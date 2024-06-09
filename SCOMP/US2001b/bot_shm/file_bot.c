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

int check_for_new_files(const char *input_path);
void distribute_files(shared_memory *shm_ptr, config *config, sem_t *job_sem_id);

pid_t run_watcher(config *config, shared_memory *shm_ptr, sem_t *sem_id, sem_t *job_sem_id) {
    pid_t pid = fork();
    if (pid == -1) {
        perror("Impossível criar o processo watcher");
        exit(EXIT_FAILURE);
    }

    if (pid == 0) { // Processo filho (watcher)
        while (!should_terminate) { // Controle de terminação
            printf("[Monitor] Procurando novos ficheiros\n");
            int found_new_files = check_for_new_files(config->input_path);

            if (found_new_files) {
                printf("[Monitor] Novos ficheiros encontrados\n");
                sem_wait(sem_id);
                printf("[Monitor] Semáforo adquirido\n");

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
                        if (sscanf(entry->d_name, "%d-candidate-data.txt", &prefix) == 1) {
                            int already_processed = 0;

                            for (int i = 0; i < shm_ptr->processed_files_count; i++) {
                                if (shm_ptr->processed_files[i] == prefix) {
                                    already_processed = 1;
                                    break;
                                }
                            }

                            for (int i = 0; i < shm_ptr->job_queue.count; i++) {
                                if (shm_ptr->job_queue.buffer[(shm_ptr->job_queue.head + i) % BUFFER_SIZE].prefix == prefix) {
                                    already_processed = 1;
                                    break;
                                }
                            }

                            if (!already_processed && shm_ptr->job_queue.count < BUFFER_SIZE) {
                                shm_ptr->job_queue.buffer[shm_ptr->job_queue.tail].prefix = prefix;
                                shm_ptr->job_queue.tail = (shm_ptr->job_queue.tail + 1) % BUFFER_SIZE;
                                shm_ptr->job_queue.count++;
                                printf("[Monitor] Prefixo adicionado ao buffer: %d\n", prefix);
                                sem_post(job_sem_id); // Sinaliza que há novos trabalhos
                            } else {
                                printf("[Monitor] Buffer circular cheio ou prefixo já processado, não é possível adicionar mais trabalhos\n");
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


void run_parent(worker *workers, pid_t watcher_pid, config *config, shared_memory *shm_ptr, sem_t *sem_id, sem_t *job_sem_id) {
    while (!should_terminate) {
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

    terminate(workers, watcher_pid, config, shm_ptr, sem_id, job_sem_id);
}

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

int check_for_new_files(const char *input_path) {
    DIR *dir = opendir(input_path);
    if (dir == NULL) {
        perror("Erro ao abrir o diretório");
        return 0;
    }

    struct dirent *entry;
    while ((entry = readdir(dir)) != NULL) {
        if (entry->d_type == DT_REG) {
            closedir(dir);
            return 1;
        }
    }

    closedir(dir);
    return 0;
}

void distribute_files(shared_memory *shm_ptr, config *config, sem_t *job_sem_id) {
    while (shm_ptr->job_queue.count > 0) {
        int prefix = shm_ptr->job_queue.buffer[shm_ptr->job_queue.head].prefix;
        shm_ptr->job_queue.head = (shm_ptr->job_queue.head + 1) % BUFFER_SIZE;
        shm_ptr->job_queue.count--;

        int assigned = 0;
        for (int i = 0; i < config->number_of_workers; i++) {
            if (shm_ptr->worker_is_busy[i] == 0) {
                shm_ptr->distributed_prefixes[i] = prefix;
                shm_ptr->worker_is_busy[i] = 1;
                printf("[Pai] Associando prefixo %d ao trabalhador %d\n", prefix, i);
                sem_post(job_sem_id);
                assigned = 1;
                break;
            }
        }

        if (!assigned) {
            // Se não puder atribuir, devolve o trabalho para o buffer
            shm_ptr->job_queue.head = (shm_ptr->job_queue.head - 1 + BUFFER_SIZE) % BUFFER_SIZE;
            shm_ptr->job_queue.buffer[shm_ptr->job_queue.head].prefix = prefix;
            shm_ptr->job_queue.count++;
            break;
        }
    }
}
