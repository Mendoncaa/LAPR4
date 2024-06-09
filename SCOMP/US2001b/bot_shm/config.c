#include "config.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void get_config(config *config, int argc, char *argv[]) {
    if (argc > 1 && argc != 5) {
        printf("Usage: file_bot <input_path> <output_path> <number_of_workers> <watcher_interval>\n");
        exit(EXIT_FAILURE);
    }

    if (argc == 5) {
        if (snprintf(config->input_path, MAX_PATH_LENGTH, "%s", argv[1]) >= MAX_PATH_LENGTH ||
            snprintf(config->output_path, MAX_PATH_LENGTH, "%s", argv[2]) >= MAX_PATH_LENGTH) {
            fprintf(stderr, "Caminho de diretório muito longo.\n");
            exit(EXIT_FAILURE);
        }
        config->number_of_workers = atoi(argv[3]);
        config->watcher_interval = atoi(argv[4]);
    } else {
        snprintf(config->input_path, MAX_PATH_LENGTH, "../Email_Bot_Shm/");
        snprintf(config->output_path, MAX_PATH_LENGTH, "../File_Report_Shm/");
        config->number_of_workers = 5;
        config->watcher_interval = 10;
    }
}
