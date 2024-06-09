#include "worker.h"
#include "shared_memory.h"
#include "config.h"
#include <assert.h>
#include <signal.h>

void test_init_workers_and_run_worker() {
    shared_memory *shm_ptr;
    int shm_fd;
    sem_t *sem_id, *job_sem_id, *log_mutex;
    config cfg;

    initialize_shared_memory(&shm_ptr, &shm_fd);
    initialize_semaphores(&sem_id, &job_sem_id, &log_mutex);
    get_config(&cfg, 0, NULL); // Inicia a configuração padrão

    worker workers[cfg.number_of_workers];
    init_workers(workers, &cfg, shm_ptr, sem_id, job_sem_id, log_mutex);

    // Simular a adição de um trabalho
    sem_wait(sem_id);
    shm_ptr->job_queue.buffer[shm_ptr->job_queue.tail].prefix = 123;
    shm_ptr->job_queue.tail = (shm_ptr->job_queue.tail + 1) % BUFFER_SIZE;
    shm_ptr->job_queue.count++;
    sem_post(sem_id);
    sem_post(job_sem_id); // Sinalizar que há trabalho

    sleep(5); // Espera o trabalhador processar o trabalho

    // Verifica se o trabalho foi processado corretamente
    sem_wait(sem_id);
    assert(shm_ptr->job_queue.count == 0); // Verifica se o trabalho foi retirado da fila
    assert(shm_ptr->processed_files_count == 1);
    assert(shm_ptr->processed_files[0] == 123);
    sem_post(sem_id);

    // Limpar os trabalhadores e recursos
    for (int i = 0; i < cfg.number_of_workers; i++) {
        kill(workers[i].pid, SIGTERM);
        waitpid(workers[i].pid, NULL, 0);
    }
    cleanup_resources(shm_ptr, shm_fd, sem_id, job_sem_id, log_mutex);

    printf("init_workers_and_run_worker passed\n");
}

int main() {
    test_init_workers_and_run_worker();
    return 0;
}
