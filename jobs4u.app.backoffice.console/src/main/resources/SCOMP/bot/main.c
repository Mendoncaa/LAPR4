#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <signal.h>
#include <sys/wait.h>
#include <fcntl.h>
#include <string.h>
#include "signal_handler.h"
#include "process_file.h"
#include "parent.h"
#include "monitoring_class.h"
#include "write_report.h"

#define STR_MAX 255

pid_t *pids;
int size = 0;
sig_atomic_t given_sig = 0;
int *child_process = NULL;

void handle_signint(int sig);
void handle_sigusr1(int sig);
void handle_sigusr2(int sig);

// Main function: Initializes resources and manages child processes.
int main(int argc, char *argv[]) {
    if (argc < 5) {
        fprintf(stderr, "Usage: %s <path> <alarm> <num_childs> <output_fd>\n", argv[0]);
        exit(EXIT_FAILURE);
    }

    char *email_bot_path = argv[1]; // Email bot script path
    int alarm = atoi(argv[2]);      // Unused alarm variable
    int num_childs = atoi(argv[3]); // Number of child processes
    char *output_dir_path = argv[4];// Output directory path for reports and logs

    child_process = (int *)malloc(num_childs * sizeof(int)); // Allocate memory for child process statuses
    if (child_process == NULL) {
        perror("Error allocating memory for child_process array");
        exit(EXIT_FAILURE);
    }

    // Create pipes for inter-process communication
    int fd[num_childs][2]; // File descriptors for data pipes
    int str_pipe[num_childs][2]; // File descriptors for status pipes

    for (int i = 0; i < num_childs; i++) {
        if (pipe(str_pipe[i]) == -1 || pipe(fd[i]) == -1) {
            perror("Error creating pipes");
            exit(EXIT_FAILURE);
        }
    }

    pids = (pid_t *)malloc(num_childs * sizeof(pid_t)); // Allocate memory for storing child PIDs
    if (pids == NULL) {
        perror("Error allocating memory for pids array");
        exit(EXIT_FAILURE);
    }

    struct sigaction sa; // Signal handling setup
    memset(&sa, 0, sizeof(sa));
    sa.sa_handler = handle_signint;
    sigaction(SIGINT, &sa, NULL);

    sa.sa_handler = handle_sigusr1;
    sigaction(SIGUSR1, &sa, NULL);

    sa.sa_handler = handle_sigusr2;
    sigaction(SIGUSR2, &sa, NULL);
    
    // Fork child processes to handle file processing
    for (int i = 0; i < num_childs; i++) {
        pids[i] = fork();
        if (pids[i] == 0) { // Child process
            close(fd[i][1]); // Close unused write end of the pipe
            close(str_pipe[i][0]); // Close unused read end of the status pipe
            process_file(email_bot_path, output_dir_path);
            exit(0);
        }
    }

    // Close unused pipe ends in the parent process
    for (int i = 0; i < num_childs; i++) {
        close(fd[i][0]); // Close read end of the data pipe
        close(str_pipe[i][1]); // Close write end of the status pipe
    }

    pid_t watcher_pid = fork(); // Fork a separate process for monitoring directory changes
    if (watcher_pid == 0) {
        monitor_directory(email_bot_path, getppid()); // Start monitoring
        exit(0);
    }

    while (1) {
        pause();  // Wait for signals to handle events
        if (given_sig == SIGUSR1) {
            // React to SIGUSR1 signal by re-checking or reallocating files
            for (int i = 0; i < num_childs; i++) {
                printFicheiro(str_pipe[i], STR_MAX, output_dir_path); // Print file info to report
            }
            given_sig = 0; // Reset signal indicator
        }
    }

    // Cleanup resources
    free(pids);
    free(child_process);
    return 0;
}
