#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <fcntl.h>

void process_file(const char *file_path, int child_id) {
    int input_fd, output_fd;
    char output_file_name[256];
    char buffer[1024];
    ssize_t bytes_read;

    input_fd = open(file_path, O_RDONLY);
    if (input_fd == -1) {
        perror("Failed to open input file");
        return;
    }

    sprintf(output_file_name, "output_%d.txt", child_id);
    output_fd = open(output_file_name, O_WRONLY | O_CREAT | O_TRUNC, 0644);
    if (output_fd == -1) {
        perror("Failed to open output file");
        close(input_fd);
        return;
    }

    while ((bytes_read = read(input_fd, buffer, sizeof(buffer))) > 0) {
        if (write(output_fd, buffer, bytes_read) == -1) {
            perror("Failed to write to output file");
            break;
        }
    }

    if (bytes_read == -1) {
        perror("Failed to read from input file");
    }

    close(input_fd);
    close(output_fd);
}
