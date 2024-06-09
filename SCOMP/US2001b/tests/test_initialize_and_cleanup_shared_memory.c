#include "file_bot.h"
#include "shared_memory.h"
#include <assert.h>

void test_initialize_and_cleanup_shared_memory() {
    shared_memory *shm_ptr;
    int shm_fd;
    sem_t *sem_id, *job_sem_id, *log_mutex;

    initialize_shared_memory(&shm_ptr, &shm_fd);
    initialize_semaphores(&sem_id, &job_sem_id, &log_mutex);

    // Verifica se a memória compartilhada e os semáforos foram inicializados corretamente
    assert(shm_ptr != NULL);
    assert(sem_id != NULL);
    assert(job_sem_id != NULL);
    assert(log_mutex != NULL);

    cleanup_resources(shm_ptr, shm_fd, sem_id, job_sem_id, log_mutex);
    printf("initialize_and_cleanup_shared_memory passed\n");
}

int main() {
    test_initialize_and_cleanup_shared_memory();
    return 0;
}
