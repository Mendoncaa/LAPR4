#include <stdio.h>
#include <stdlib.h>
#include <dirent.h>
#include <signal.h>
#include <string.h>
#include <unistd.h>
#include <stdbool.h>
#include "signal_handler.h"

// Verifica a existência de arquivos regulares dentro de um diretório
bool existFile(const char *filename) {
    DIR *dir = opendir(filename);
    if (dir == NULL) {
        perror("Directory open failed");
        return false;
    }

    struct dirent *entry;
    while ((entry = readdir(dir)) != NULL) {
        if (entry->d_type == DT_REG) {
            closedir(dir);
            return true;
        }
    }

    closedir(dir);
    return false;
}

// Monitora continuamente um diretório e envia um sinal SIGUSR1 ao processo pai se novos arquivos forem encontrados
void monitor_directory(const char *directory_path, int pid) {
    while (1) {
        sleep(10);  // Intervalo entre cada verificação
        if (existFile(directory_path)) {
            kill(pid, SIGUSR1);
        } else {
            fprintf(stderr, "No files found in directory\n");
        }
    }
}

