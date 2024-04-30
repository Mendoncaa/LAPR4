#include <stdio.h>
#include <stdlib.h>
#include <signal.h>

volatile sig_atomic_t keep_running = 1;

void handle_sigint(int sig) {
    keep_running = 0; 
}

int setup_signal_handler() {
    struct sigaction action;
    action.sa_handler = handle_sigint;
    sigemptyset(&action.sa_mask);
    action.sa_flags = 0;

    if (sigaction(SIGINT, &action, NULL) < 0) {
        perror("sigaction");
        return EXIT_FAILURE;
    }

    return EXIT_SUCCESS;
}
