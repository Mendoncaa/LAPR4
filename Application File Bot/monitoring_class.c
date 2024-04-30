#include <stdio.h>
#include <stdlib.h>
#include <dirent.h>
#include <string.h>
#include <unistd.h>
#include <sys/stat.h>
#include <sys/types.h>
#include "signal_handler.h"
#include "process_file.h"
#include "worker.h"


#define INPUT_DIR "./input" 
#define POLL_INTERVAL 5     

int directory_exists(const char *path) {
    struct stat statbuf;
    if (stat(path, &statbuf) != 0)
        return 0;
    return S_ISDIR(statbuf.st_mode);
}

void monitor_directory() {
    DIR *dir;
    struct dirent *entry;

    if (!directory_exists(INPUT_DIR)) {
        fprintf(stderr, "Directory '%s' does not exist.\n", INPUT_DIR);
        exit(EXIT_FAILURE);
    }

    while(keep_running) {
        if ((dir = opendir(INPUT_DIR)) == NULL) {
            perror("opendir");
            exit(EXIT_FAILURE);
        }

        while ((entry = readdir(dir)) != NULL) {
            if (entry->d_type == DT_REG) {
                process_file(entry->d_name);
            }
        }
        closedir(dir);
        sleep(POLL_INTERVAL);
    }
}
