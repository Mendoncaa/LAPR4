#ifndef SHARED_MEMORY_H
#define SHARED_MEMORY_H

#include "config.h"
#include "shared.h"
#include <semaphore.h>

#define BUFFER_SIZE 10
#define MAX_PROCESSED_FILES 1000


typedef struct {
    int prefix;
    char file_name[MAX_PATH_LENGTH];
} job_item;

typedef struct {
    job_item buffer[BUFFER_SIZE];
    int head;
    int tail;
    int count;
} circular_buffer;

typedef struct {
char processed_files[MAX_PROCESSED_FILES][MAX_PATH_LENGTH];
int processed_files_count;
    int found_new_files;
    circular_buffer job_queue;
    int distributed_prefixes_length;
    int jobs_length;
    int worker_is_busy[MAX_WORKERS];
    job jobs[MAX_JOBS];
    int distributed_prefixes[MAX_WORKERS];
} shared_memory;

#endif // SHARED_MEMORY_H