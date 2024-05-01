#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <fcntl.h>
#include <string.h>
#include <sys/stat.h>
#include <signal.h>

char *generate_file_name(char *directory_path, int str_max, const char *output_file);

char *generate_file_name(char *directory_path, int str_max, char *output_file) {
        char *file_name = malloc(str_max);
        char *file_name_start = strrchr(directory_path, '/');
        char file[str_max];

        if (file_name != NULL) {
            if (file_name_start != NULL) {
                file_name_start++;
            } else {
                file_name_start = directory_path;
            }

            sprintf(file, "Application %s", strtok(file_name_start, "-"));
            sprintf(file_name, "%s/%s", output_file, file);
        }

        return file_name;
}

void process_file(int pipe[], int str_pipe[], const char *path, int str_max, char *output_file, int num) {
    close(pipe[1]);
    close(str_pipe[0]);

    char directory_path[str_max];
    int input_fd = 0, output_fd = 0;
    char output_file[str_max];
    char new_output_name[str_max];

    while (read(pipe[0], directory_path, sizeof(char) * str_max) > 0) {
        if (input_fd == 0) {
            output_fd = 1;

            char* token;
            token = strtok(directory_path, "/");
            input_fd = atoi(token);
            token = strtok(NULL, "/");
            if (token != NULL) {
                strcpy(output_file, token);
            }

            sprintf(new_output_name, "%s/%s", output_file, output_file);

            if (input_fd == -1) {
                char str_stop[str_max*3];
                strcpy(str_stop, "STOP");
                write(str_pipe[1], str_stop, str_max*3);
                input_fd = 0;
            }
        } else {
            if (output_fd == 1) {
                char aux[str_max];
                strcpy(aux, output_file);
                strcat(aux, "\n");
                write(str_pipe[1], aux, str_max);
                output_fd = 0;
            }

            char *str_aux = malloc(str_max);
            strcpy(str_aux, directory_path);

            char *file_name = generate_file_name(directory_path, str_max, output_file);

            struct stat st_one = {0};
            struct stat st_two = {0};
            struct stat st_three = {0};

            if (stat(output_fd, &st_two) == -1) {
                mkdir(output_fd, 0777);
            }

            if (stat(output_file, &st_three) == -1) {
                mkdir(output_file, 0777);
            }

            if (stat(file_name, &st_one) == -1) {
                mkdir(file_name, 0777);
            }

            char *file_name_start = strrchr(str_aux, '/');
            file_name_start++;

            char *file_name_aux = malloc(str_max);
            sprintf(file_name_aux, "%s/%s", file_name, file_name_start);

            if (rename(str_aux, file_name_aux) == 0) {
                char str_aux[str_max*3];
                sprintf(str_aux, "\t%s/%s\n", file_name, file_name_start);
                write(str_pipe[1], str_aux, str_max*3);
            } else {
                char str_aux[str_max*3];
                sprintf(str_aux, "\tERROR: %s / %s\n", str_aux, file_name_aux);
                write(str_pipe[1], str_aux, str_max*3);
            }

            input_fd--;

            if (input_fd == 0) {
                kill(getppid(), SIGUSR2);
            }
        }
    }
    
    close(pipe[0]);
    close(str_pipe[1]);
    kill(getpid(), SIGUSR2);
}


