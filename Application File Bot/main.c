#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <signal.h>
#include <sys/wait.h>
#include <fcntl.h>
#include "signal_handler.h"
#include "process_file.h"
#include "parent.h"
#include "monitoring_class.h"

#define STR_MAX 255



pid_t *pids;
int size = 0;
sig_atomic_t keep_running = 0;
int *child_process = NULL;

int main(int argc, char *argv[]) {

    char *path = argv[1];
    int alarm = atoi(argv[2]);
    int num_childs = atoi(argv[3]);
    char *output_fd = argv[4];

    child_process = (int *)malloc(num_childs * sizeof(int));
    if (child_process == NULL) {
       perror("ERROR: Allocating memory child_process array");
       kill(getpid(), SIGINT);
    }

    char str_alarm[20];
    sprintf(str_alarm, "%d", alarm);

    size = num_childs + 1;
    for (int i = 0; i < num_childs; i++) {
        child_process[i] = 0;
    }

    int fd[num_childs][2];
    int str_pipe[num_childs][2];

    for (int i = 0; i < num_childs; i++) {

        if (pipe(str_pipe[i])) {
            perror("ERROR: creating pipe. (W)");
            kill(getpid(), SIGINT);
        }

        if (pipe(fd[i])) {
            perror("ERROR: creating pipe. (W)");
            kill(getpid(), SIGINT);
        }
    }

    pid_array = (pid_t *)malloc((size) * sizeof(pid_t));

    struct sigaction act;

    act.sa_sigaction = handle_SIGNINT;
    act.sa_flags = SA_SIGINFO;
    sigaction(SIGINT, &act, NULL);

    act.sa_sigaction = handle_SIGUSR1;
    act.sa_flags = SA_SIGINFO;
    sigaction(SIGUSR1, &act, NULL);

    act.sa_sigaction = handle_SIGUSR2;
    act.sa_flags = SA_SIGINFO;
    sigaction(SIGUSR2, &act, NULL);

    pid_t pid = fork();
    
    if (pid == 0) {
        int result;
        char pid_str[10];

        sprintf(pid_str, "%d", getppid());

        char *args[] = {"ex", str_alarm, path, pid_str,(char *)NULL};
        result = execvp("./ex", args);  // se nao der criar a pasta com o process_file dentro 
        kill(getppid(), SIGINT);

    } else {
        *(pid_array + 0) = pid;
    }

    for (int i = 0; i < size - 1; i++) {

        pid = fork();
        *(pid_array + i + 1) = pid;

        if (pid == 0) {
            sortFiles(fd[i], str_pipe[i], path, STR_MAX, output_fd, i);
            kill(getppid(),SIGINT);
        }
    }

    for (int i = 0; i < num_childs; i++) {
        close(str_pipe[i][1]);
        close(fd[i][0]);
    }

    while (1) {
        pause();
        if (given_sig == SIGUSR1) {
            given_sig = 0;

            int num = distributeFiles(num_childs, fd, path, STR_MAX, child_process);

            int all_stop = 1;

            while (all_stop) {
                all_stop = 0;
                for (int i = 0; i < num_childs; i++) {
                    if (child_process[i] == 1) {
                        all_stop = 1;
                    }
                }
            }

            for (int i = 0; i < num_childs; i++) {
                printInFile(str_pipe[i], STR_MAX, output_fd);
            }
        }
    }

    for (int i = 0; i < num_childs; i++) {
        close(str_pipe[i][0]);
        close(fd[i][1]);
    }

    free(pid_array);
    free(child_process);

    return 0;
}
