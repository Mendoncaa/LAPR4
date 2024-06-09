#include "file_bot.h"
#include <sys/mman.h>
#include <semaphore.h>
#include <unistd.h>
#include <fcntl.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

void initialize_shared_memory(shared_memory **shm_ptr, int *shm_fd);
void initialize_semaphores(sem_t **sem_id, sem_t **job_sem_id, sem_t **log_mutex);
void cleanup_resources(shared_memory *shm_ptr, int shm_fd, sem_t *sem_id, sem_t *job_sem_id, sem_t *log_mutex);

volatile sig_atomic_t should_terminate = 0;

void handle_sigint(int signal);

int main(int argc, char *argv[]) {
    config config;

    // Obtém a configuração passada como argumento
    get_config(&config, argc, argv);

    // Inicializa a memória compartilhada
    shared_memory *shm_ptr;
    int shm_fd;
    initialize_shared_memory(&shm_ptr, &shm_fd);

    // Inicializa os semáforos
    sem_t *sem_id;
    sem_t *job_sem_id;
    sem_t *log_mutex;
    initialize_semaphores(&sem_id, &job_sem_id, &log_mutex);

    // Cria e inicializa os trabalhadores
    worker workers[config.number_of_workers];
    init_workers(workers, &config, shm_ptr, sem_id, job_sem_id, log_mutex);

    // Configura os handlers de sinal para SIGINT
    struct sigaction act;
    memset(&act, 0, sizeof(struct sigaction));
    act.sa_handler = handle_sigint;
    sigaction(SIGINT, &act, NULL);

    // Executa o processo watcher para monitorar novos arquivos
    pid_t watcher_pid = run_watcher(&config, shm_ptr, sem_id, job_sem_id);

    // Executa o processo pai
    run_parent(workers, watcher_pid, &config, shm_ptr, sem_id, job_sem_id);

    // Limpa os recursos POSIX IPC
    cleanup_resources(shm_ptr, shm_fd, sem_id, job_sem_id, log_mutex);

    return 0;
}

void handle_sigint(int signal) {
    (void)signal;  // Suprime o aviso de parâmetro não utilizado
    should_terminate = 1;
}

void initialize_shared_memory(shared_memory **shm_ptr, int *shm_fd) {
    *shm_fd = shm_open("/file_bot_shm", O_CREAT | O_RDWR, 0666);
    if (*shm_fd == -1) {
        perror("Erro ao abrir memória compartilhada");
        exit(EXIT_FAILURE);
    }

    if (ftruncate(*shm_fd, sizeof(shared_memory)) == -1) {
        perror("Erro ao ajustar tamanho da memória compartilhada");
        exit(EXIT_FAILURE);
    }

    *shm_ptr = mmap(0, sizeof(shared_memory), PROT_READ | PROT_WRITE, MAP_SHARED, *shm_fd, 0);
    if (*shm_ptr == MAP_FAILED) {
        perror("Erro ao mapear memória compartilhada");
        exit(EXIT_FAILURE);
    }

    memset(*shm_ptr, 0, sizeof(shared_memory));
}

void initialize_semaphores(sem_t **sem_id, sem_t **job_sem_id, sem_t **log_mutex) {
    *sem_id = sem_open("/file_bot_sem", O_CREAT, 0666, 1);
    if (*sem_id == SEM_FAILED) {
        perror("Erro ao abrir o semáforo");
        exit(EXIT_FAILURE);
    }

    *job_sem_id = sem_open("/file_bot_job_sem", O_CREAT, 0666, 0);
    if (*job_sem_id == SEM_FAILED) {
        perror("Erro ao abrir o semáforo de trabalho");
        exit(EXIT_FAILURE);
    }

    *log_mutex = sem_open("/file_bot_log_mutex", O_CREAT, 0666, 1);
    if (*log_mutex == SEM_FAILED) {
        perror("Erro ao abrir o semáforo de log");
        exit(EXIT_FAILURE);
    }
}

void cleanup_resources(shared_memory *shm_ptr, int shm_fd, sem_t *sem_id, sem_t *job_sem_id, sem_t *log_mutex) {
    munmap(shm_ptr, sizeof(shared_memory));
    close(shm_fd);
    shm_unlink("/file_bot_shm");

    sem_close(sem_id);
    sem_unlink("/file_bot_sem");
    sem_close(job_sem_id);
    sem_unlink("/file_bot_job_sem");
    sem_close(log_mutex);
    sem_unlink("/file_bot_log_mutex");
}
