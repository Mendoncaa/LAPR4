#ifndef CONFIG_H
#define CONFIG_H

#define MAX_PATH_LENGTH 256
#define MAX_WORKERS 10
#define MAX_JOBS 100
#define MAX_JOB_REFERENCE_LENGTH 64

typedef struct {
    char input_path[MAX_PATH_LENGTH];
    char output_path[MAX_PATH_LENGTH];
    int number_of_workers;
    int watcher_interval;
} config;

void get_config(config *config, int argc, char *argv[]);

#endif // CONFIG_H
