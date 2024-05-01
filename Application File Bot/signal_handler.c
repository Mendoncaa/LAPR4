#include <stdio.h>
#include <stdlib.h>
#include <signal.h>

pid_t *pids;
int size = 0;
sig_atomic_t keep_running = 0;

void handle_SIGNINT(int signo) {
    if (pids == NULL) {
        exit(1);
    }

    for (int i = 0; i < size; i++) {
       kill(pids[i], SIGKILL);
    }

    exit(1);
}

void handle_SIGUSR2(int num_sig, siginfo_t *info, void *context) {
    keep_running = num_sig;
    for(int i = 0; i < size; i++){
        if(pids[i+1] == info->si_pid){
            childProcessIsBusy[i] = 0;
        }
    }
}

void handle_SIGUSR1(int sig) {
    keep_running = sig;
}
