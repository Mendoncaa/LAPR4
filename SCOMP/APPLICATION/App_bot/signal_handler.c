#include <stdio.h>
#include <stdlib.h>
#include <signal.h>

extern pid_t *pids;
extern int size;
extern sig_atomic_t given_sig;

void handle_signint(int sig) {
    fprintf(stderr, "Interrupt signal received.\n");
    for (int i = 0; i < size; i++) {
        if (pids[i] != 0) {
            kill(pids[i], SIGKILL);
        }
    }
    exit(EXIT_FAILURE);
}

void handle_sigusr1(int sig) {
    given_sig = SIGUSR1;
}

void handle_sigusr2(int sig) {
    given_sig = SIGUSR2;
}

