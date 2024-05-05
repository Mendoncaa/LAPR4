#include <stdio.h>
#include <stdlib.h>
#include <dirent.h>
#include <signal.h>
#include <string.h>
#include <unistd.h>
#include <stdbool.h>
#include "signal_handler.h"

// Checks if the specified directory contains any regular files.
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

// Monitors the specified directory for new files and sends a signal if new files are detected.
void monitor_directory(const char *directory_path, int pid) {
    while (1) {
        sleep(10);  // Sleeps for 10 seconds between checks
        if (existFile(directory_path)) {
            kill(pid, SIGUSR1); // Send SIGUSR1 to the parent process if new files are found
        } else {
            fprintf(stderr, "No files found in directory\n");
        }
    }
}
