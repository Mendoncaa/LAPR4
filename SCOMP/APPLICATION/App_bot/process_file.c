#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <fcntl.h>
#include <string.h>
#include <sys/stat.h>
#include <signal.h>
#include <limits.h> 
#include <errno.h>

char *generate_file_name(char *directory_path, int str_max, const char *output_file);

// Processa cada arquivo lido de um pipe, move para um novo diretório e grava as ações em outro pipe
void process_file(int pipe[], int str_pipe[], const char *path, int str_max, const char *output_file_path, int num) {
    close(pipe[1]); // Fecha o lado de escrita do pipe de entrada
    close(str_pipe[0]); // Fecha o lado de leitura do pipe de saída

    char directory_path[str_max];
    int count = 0;
    char *file_name = NULL;

    while (read(pipe[0], directory_path, sizeof(directory_path)) > 0) {
        if (count == 0) {
            count = atoi(directory_path);
        } else {
            file_name = generate_file_name(directory_path, str_max, output_file_path);
            if (file_name == NULL) {
                continue; // Se file_name for NULL, continue para evitar problemas
            }

            if (mkdir(file_name, 0777) == -1 && errno != EEXIST) {
                perror("Directory creation failed");
                free(file_name);
                continue;
            }

            char new_path[PATH_MAX];
            snprintf(new_path, sizeof(new_path), "%s/%s", file_name, strrchr(directory_path, '/') + 1);

            if (rename(directory_path, new_path) == -1) {
                perror("File moving failed");
            }

            char log_entry[str_max * 3];
            snprintf(log_entry, sizeof(log_entry), "\tMoved to: %s\n", new_path);
            write(str_pipe[1], log_entry, strlen(log_entry));

            free(file_name); // Libera file_name após seu uso
            count--;
            if (count == 0) {
                kill(getppid(), SIGUSR2);
                break;
            }
        }
    }

    close(pipe[0]); // Fecha o lado de leitura do pipe de entrada
    close(str_pipe[1]); // Fecha o lado de escrita do pipe de saída
}

// Gera um nome de diretório baseado em um caminho de arquivo e diretório de saída
char *generate_file_name(char *directory_path, int str_max, const char *output_dir) {
    char *file_name = malloc(str_max);
    if (file_name == NULL) {
        perror("Memory allocation for file_name failed");
        return NULL;
    }

    char *base_name = strrchr(directory_path, '/');
    if (base_name) {
        base_name++; // Pula o caractere '/'
    } else {
        base_name = directory_path;
    }

    snprintf(file_name, str_max, "%s%s", output_dir, base_name);
    return file_name;
}






