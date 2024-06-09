#include "file_bot.h"
#include "shared_memory.h"
#include "config.h"
#include <assert.h>
#include <signal.h>

void test_run_watcher_and_distribute_files() {
    shared_memory *shm_ptr;
    int shm_fd;
    sem_t *sem_id, *job_sem_id, *log_mutex;
    config cfg;

    initialize_shared_memory(&shm_ptr, &shm_fd);
    initialize_semaphores(&sem_id, &job_sem_id, &log_mutex);
    get_config(&cfg, 0, NULL); // Inicia a configuração padrão

    pid_t watcher_pid = run_watcher(&cfg, shm_ptr, sem_id, job_sem_id);
    sleep(5); // Espera o watcher adicionar alguns trabalhos

    distribute_files(shm_ptr, &cfg, job_sem_id);

    // Verifica se os trabalhos foram distribuídos corretamente
    assert(shm_ptr->job_queue.count == 0); // Supondo que todos os trabalhos foram distribuídos

    kill(watcher_pid, SIGTERM); // Encerra o watcher
    cleanup_resources(shm_ptr, shm_fd, sem_id, job_sem_id, log_mutex);

    printf("run_watcher_and_distribute_files passed\n");
}

int main() {
    test_run_watcher_and_distribute_files();
    return 0;
}
