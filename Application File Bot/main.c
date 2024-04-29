#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>
#include <string.h>
#include "worker.h"
#include "write_report.h"
#include "process_file.h"


#define MAX_CHILDREN 6

extern void worker(const char *file_name, int child_id);
extern void write_report(const char *report_data);

int main() {
    pid_t child_pid[MAX_CHILDREN];
    int i;

    
    char report_data[1024] = "Processing Completed:\n";

    // Criação de processos filhos
    for (i = 0; i < MAX_CHILDREN; i++) {
        child_pid[i] = fork();
        if (child_pid[i] == 0) { 
            char file_name[256];
            sprintf(file_name, "file%d.txt", i);
            worker(file_name, i);
            exit(0);
        } else if (child_pid[i] < 0) {
            perror("fork");
            exit(EXIT_FAILURE);
        }
    }

    // Esperar todos os filhos terminarem
    for (i = 0; i < MAX_CHILDREN; i++) {
        waitpid(child_pid[i], NULL, 0);
    }

    strcat(report_data, "All files processed.");
    write_report(report_data);

    return 0;
}