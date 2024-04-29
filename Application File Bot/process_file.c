#include <stdio.h>
#include <unistd.h>
#include <fcntl.h>
#include "process_file.h"

void process_file(const char *file_path, int child_id) {
    int fd = open(file_path, O_RDONLY);
    if (fd < 0) {
        perror("Failed to open input file");
        return;
    }

    char output_file[256];
    sprintf(output_file, "output_%d.txt", child_id);

    int fd_out = open(output_file, O_WRONLY | O_CREAT | O_TRUNC, 0644);
    if (fd_out < 0) {
        perror("Failed to open output file");
        close(fd);
        return;
    }

    char buf[1024];
    ssize_t nread;
    while ((nread = read(fd, buf, sizeof(buf))) > 0) {
        write(fd_out, buf, nread);
    }

    close(fd);
    close(fd_out);
}