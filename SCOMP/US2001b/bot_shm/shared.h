#ifndef SHARED_H
#define SHARED_H

#include <signal.h>
#include "config.h"

extern volatile sig_atomic_t should_terminate;

typedef struct {
    int prefix;
    char output_directory[MAX_PATH_LENGTH];
    char copied_files[MAX_PATH_LENGTH][MAX_PATH_LENGTH];
    int length;
} job;

#endif // SHARED_H
