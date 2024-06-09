#include "worker.h"
#include "shared.h"
#include "config.h"
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <dirent.h>
#include <string.h>
#include <signal.h>
#include <fcntl.h>
#include <sys/mman.h>
#include <semaphore.h>
#include <sys/stat.h>
#include <errno.h>

extern volatile sig_atomic_t should_terminate;
void create_directory_based_on_file(job *job, int prefix, config *config, int worker_index);

void init_workers(worker *workers, config *config, shared_memory *shm_ptr, sem_t *sem_id, sem_t *job_sem_id, sem_t *log_mutex) {
    for (int i = 0; i < config->number_of_workers; i++) {
        workers[i].is_busy = 0;
        pid_t pid = fork();
        workers[i].pid = pid;

        if (pid == -1) {
            perror("Trabalhador não criado.");
            exit(EXIT_FAILURE);
        }

        if (pid == 0) {
            run_worker(i, config, shm_ptr, sem_id, job_sem_id, log_mutex);
            exit(EXIT_SUCCESS);
        }
    }
}

void run_worker(int worker_index, config *config, shared_memory *shm_ptr, sem_t *sem_id, sem_t *job_sem_id, sem_t *log_mutex) {
    while (!should_terminate) {
        sem_wait(job_sem_id);
        printf("[Trabalhador %d] Semáforo de trabalho adquirido\n", worker_index);

        int prefix = -1;
        sem_wait(sem_id);
        if (shm_ptr->job_queue.count > 0) {
            prefix = shm_ptr->job_queue.buffer[shm_ptr->job_queue.head].prefix;
            shm_ptr->job_queue.head = (shm_ptr->job_queue.head + 1) % BUFFER_SIZE;
            shm_ptr->job_queue.count--;
        }
        sem_post(sem_id);

        if (prefix == -1) {
            continue;
        }

        printf("[Trabalhador %d] Processando prefixo %d\n", worker_index, prefix);

        job job;
        job.length = 0;
        job.prefix = prefix;

        // Criar o diretório baseado na primeira linha do arquivo n-candidate-data.txt
        create_directory_based_on_file(&job, prefix, config, worker_index);

        // Mover os arquivos com o prefixo correspondente
        move_files(&job, prefix, config, worker_index);

        sem_wait(sem_id);
        shm_ptr->jobs[shm_ptr->jobs_length++] = job;
        shm_ptr->processed_files[shm_ptr->processed_files_count++] == prefix;
        sem_post(sem_id);

        // Escrever no relatório
        sem_wait(log_mutex);
        generate_worker_report(&job, config);
        sem_post(log_mutex);

        printf("[Trabalhador %d] Trabalho concluído\n", worker_index);

        sleep(1);
    }

    printf("[Trabalhador] Terminando trabalhador %d\n", worker_index);
}



void create_directory_based_on_file(job *job, int prefix, config *config, int worker_index) {
    char candidate_data_filename[MAX_PATH_LENGTH];
    snprintf(candidate_data_filename, MAX_PATH_LENGTH, "%s/%d-candidate-data.txt", config->input_path, prefix);

    if (access(candidate_data_filename, F_OK) == -1) {
        perror("Arquivo candidate data não encontrado");
        return;
    }

    printf("[Trabalhador %d] Tentando abrir o arquivo de dados do candidato: %s\n", worker_index, candidate_data_filename);
    FILE *file = fopen(candidate_data_filename, "r");
    if (file == NULL) {
        fprintf(stderr, "Erro ao abrir o ficheiro candidate data: %s\n", strerror(errno));
        return;
    }

    char candidate_id[MAX_JOB_REFERENCE_LENGTH];
    if (fgets(candidate_id, MAX_JOB_REFERENCE_LENGTH, file) == NULL) {
        perror("Impossível ler a Job Reference do candidato");
        fclose(file);
        return;
    }
    fclose(file);

    candidate_id[strcspn(candidate_id, "\n")] = 0;

    char candidate_dir[MAX_PATH_LENGTH];
    snprintf(candidate_dir, MAX_PATH_LENGTH, "%s/%s", config->output_path, candidate_id);

    if (mkdir(candidate_dir, 0777) == -1 && errno != EEXIST) {
        perror("Erro ao criar o diretório do candidato");
        return;
    }

    snprintf(job->output_directory, MAX_PATH_LENGTH, "%s", candidate_dir);
}

void generate_worker_report(job *job, config *config) {
    char report_path[MAX_PATH_LENGTH + 12]; // Ajustar tamanho para evitar truncamento
    snprintf(report_path, sizeof(report_path), "%s/report.csv", config->output_path); // Usar snprintf para evitar truncamento

    printf("[Trabalhador] Gerando o relatório %s\n", report_path);

    FILE *file = fopen(report_path, "a");
    if (file == NULL) {
        perror("Erro ao abrir o arquivo de relatório");
        return;
    }

    for (int j = 0; j < job->length; j++) {
        fprintf(file, "Subdiretorio %d criado em %s baseado no ficheiro %s\n", job->prefix, job->output_directory, job->copied_files[j]);
    }

    fclose(file);
}


void move_files(job *job, int prefix, config *config, int worker_index) {
    (void)worker_index;

    char candidate_dir[MAX_PATH_LENGTH];
    snprintf(candidate_dir, MAX_PATH_LENGTH, "%s/%s", config->output_path, job->output_directory);

    DIR *dir = opendir(config->input_path);
    if (dir == NULL) {
        perror("Erro ao abrir o diretório");
        return;
    }

    struct dirent *entry;
    while ((entry = readdir(dir)) != NULL) {
        if (entry->d_type == DT_REG) {
            int file_prefix;
            if (sscanf(entry->d_name, "%d-", &file_prefix) == 1 && file_prefix == prefix) {
                char sub_dir[MAX_PATH_LENGTH];
                snprintf(sub_dir, MAX_PATH_LENGTH, "%s/%d", candidate_dir, file_prefix);

                if (mkdir(sub_dir, 0777) == -1 && errno != EEXIST) {
                    perror("Erro ao criar subdiretório");
                    continue;
                }

                char src_path[MAX_PATH_LENGTH];
                snprintf(src_path, MAX_PATH_LENGTH, "%s/%s", config->input_path, entry->d_name);

                if (access(src_path, F_OK) == -1) {
                    printf("[Trabalhador %d] Arquivo não encontrado: %s\n", worker_index, src_path);
                    continue;
                }

                char dest_path[MAX_PATH_LENGTH];
                snprintf(dest_path, MAX_PATH_LENGTH, "%s/%s", sub_dir, entry->d_name);

                if (rename(src_path, dest_path) == -1) {
                    perror("Erro ao mover arquivo");
                } else {
                    snprintf(job->copied_files[job->length], MAX_PATH_LENGTH, "%s", entry->d_name);
                    job->length++;
                }
            }
        }
    }

    closedir(dir);
}
