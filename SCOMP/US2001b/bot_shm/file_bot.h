#ifndef FILE_BOT_H
#define FILE_BOT_H

#include "config.h"
#include "shared_memory.h"
#include "worker.h"
#include <signal.h>
#include <semaphore.h>

void setup_sigusr1_handler();
void setup_sigint_handler();
pid_t run_watcher(config config, shared_memoryshm_ptr, sem_t sem_id, sem_tjob_sem_id);
void run_parent(worker workers, pid_t watcher_pid, configconfig, shared_memory shm_ptr, sem_tsem_id, sem_t job_sem_id);
void terminate(workerworkers, pid_t watcher_pid, config config, shared_memoryshm_ptr, sem_t sem_id, sem_tjob_sem_id);
void handle_sigusr1(int signal);
void handle_sigint(int signal);

#endif // FILE_BOT_H