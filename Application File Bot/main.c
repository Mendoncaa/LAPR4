#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <signal.h>
#include <sys/wait.h>
#include <fcntl.h>
#include "signal_handler.h"
#include "process_file.h"
#include "worker.h"
#include "monitoring_class.h"

#define MAX_CHILDREN 6
#define READ_END 0
#define WRITE_END 1

int main() {
    setup_signal_handler();

    int pipe_fds[MAX_CHILDREN][2];
    pid_t child_pid[MAX_CHILDREN];

    // Creating pipes and forking children
    for (int i = 0; i < MAX_CHILDREN; ++i) {
        if (pipe(pipe_fds[i]) == -1) {
            perror("Failed to create pipe");
            exit(EXIT_FAILURE);
        }
        child_pid[i] = fork();
        if (child_pid[i] == -1) {
            perror("Failed to fork");
            exit(EXIT_FAILURE);
        }

        if (child_pid[i] == 0) { // Child process
            close(pipe_fds[i][WRITE_END]); // Close unused write end
            worker(pipe_fds[i][READ_END], pipe_fds[i][WRITE_END]);
            close(pipe_fds[i][READ_END]); // Close used read end after work is done
            exit(0);
        } else { // Parent process
            close(pipe_fds[i][READ_END]); // Close unused read end
        }
    }

    // Writing report after all children are forked
    char *report_data = "Report from all children processed";
    write_report(report_data);

    // Waiting for all child processes to finish
    for (int i = 0; i < MAX_CHILDREN; i++) {
        int status;
        waitpid(child_pid[i], &status, 0);
        if (WIFEXITED(status)) {
            printf("Child %d terminated with status: %d\n", i, WEXITSTATUS(status));
        }
    }

    return 0;
}
