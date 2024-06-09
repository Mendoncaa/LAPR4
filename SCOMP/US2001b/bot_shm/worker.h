#ifndef WORKER_H
#define WORKER_H

#include "config.h"
#include "shared_memory.h"
#include <semaphore.h>

typedef struct {
    pid_t pid;
    int is_busy;
} worker;

void init_workers(worker *workers, config *config, shared_memory *shm_ptr, sem_t *sem_id, sem_t *job_sem_id, sem_t *log_mutex);
void run_worker(int worker_index, config *config, shared_memory *shm_ptr, sem_t *sem_id, sem_t *job_sem_id, sem_t *log_mutex);
void create_directory_based_on_file(job *job, int prefix, config *config, int worker_index);
void generate_worker_report(job *job, config *config);
void move_files(job *job, int prefix, config *config, int worker_index);

#endif // WORKER_H
