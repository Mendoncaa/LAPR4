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


int main(int argc, char *argv[]) {
    // Verifica se o número correto de argumentos foi fornecido
    if (argc < 5) {
        fprintf(stderr, "Usage: %s <path> <alarm> <num_childs> <output_fd>\n", argv[0]);
        exit(EXIT_FAILURE);
    }

    // Aloca memória e prepara as estruturas de dados
    char *email_bot_path = argv[1];
    int alarm = atoi(argv[2]);
    int num_childs = atoi(argv[3]);
    char *output_fd = argv[4];

    // Alocação de memória para array de processos filho
    child_process = (int *)malloc(num_childs * sizeof(int));
    if (child_process == NULL) {
       perror("Error allocating memory for child_process array");
       exit(EXIT_FAILURE);
    }

    int fd[num_childs][2];
    int str_pipe[num_childs][2];

    // Criação de pipes para comunicação interprocesso
    for (int i = 0; i < num_childs; i++) {
        if (pipe(str_pipe[i]) == -1 || pipe(fd[i]) == -1) {
            perror("Error creating pipes");
            exit(EXIT_FAILURE);
        }
    }

    pids = (pid_t *)malloc((num_childs + 1) * sizeof(pid_t));
    if (pids == NULL) {
        perror("Error allocating memory for pids array");
        exit(EXIT_FAILURE);
    }

    // Configuração de manipuladores de sinal
    struct sigaction sa;
    memset(&sa, 0, sizeof(sa));
    sa.sa_handler = handle_signint;
    sigaction(SIGINT, &sa, NULL);

    sa.sa_handler = handle_sigusr1;
    sigaction(SIGUSR1, &sa, NULL);

    sa.sa_handler = handle_sigusr2;
    sigaction(SIGUSR2, &sa, NULL);
    
    // Processo filho para monitorar diretório
    pid_t watcher_pid = fork();
    if (watcher_pid == 0) {
        monitor_directory(email_bot_path, getppid());  
        exit(0);
    }

    // Processos filhos para processar arquivos
    for (int i = 0; i < num_childs; i++) {
        pids[i] = fork();
        if (pids[i] == 0) {
            process_file(fd[i], str_pipe[i], email_bot_path, STR_MAX, output_fd, i);
            exit(0);
        }
    }

    // Loop principal para aguardar sinais e processar arquivos
    while (1) {
        pause();
        if (given_sig == SIGUSR1) {
            given_sig = 0;
            allocateFile(num_childs, fd, email_bot_path, STR_MAX, child_process);
            for (int i = 0; i < num_childs; i++) {
                printFicheiro(str_pipe[i], STR_MAX, output_fd);
            }
        }
    }

    // Limpeza de recursos
    for (int i = 0; i < num_childs; i++) {
        close(str_pipe[i][0]);
        close(fd[i][1]);
    }

    free(pids);
    free(child_process);
    return 0;
}

