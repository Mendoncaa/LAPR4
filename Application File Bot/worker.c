#include <stdio.h>
#include <unistd.h>
#include <string.h>

void worker(int read_fd, int write_fd) {
    char buffer[1024];

    ssize_t num_bytes = read(read_fd, buffer, sizeof(buffer) - 1);
    if (num_bytes > 0) {
        buffer[num_bytes] = '\0';
        printf("Worker received: %s\n", buffer);
        process_file(buffer, getpid());

        const char *completion_msg = "Processing completed";
        write(write_fd, completion_msg, strlen(completion_msg) + 1);
    } else {
        perror("read");
    }

    close(read_fd);
    close(write_fd);
}
