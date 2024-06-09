#include "shared_memory.h"
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <dirent.h>
#include <errno.h>
#include <string.h>
#include <signal.h>
#include <fcntl.h>
#include <sys/mman.h>
#include <semaphore.h>

// Função para esperar pelo semáforo
void semaphore_wait(sem_t *sem_id) {
    if (sem_wait(sem_id) == -1) {
        perror("Semaphore wait failed");
        exit(EXIT_FAILURE);
    }
}

// Função para sinalizar o semáforo
void semaphore_signal(sem_t *sem_id) {
    if (sem_post(sem_id) == -1) {
        perror("Semaphore signal failed");
        exit(EXIT_FAILURE);
    }
}
