#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <signal.h>
#include <fcntl.h>

void printFicheiro(int pipe[], int maxSize, char* output_dir) {
    printf("Printing file\n");
    FILE *file;
    char *filename = "file_report.txt";
    char filePath[maxSize + strlen(output_dir) + strlen(filename)];
    sprintf(filePath, "%s/%s", output_dir, filename);

    file = fopen(filePath, "a");
    if (file == NULL) {
        perror("Error opening file");
        exit(EXIT_FAILURE);
    }

    fprintf(file, "-----------Report----------\n");
    char buffer[maxSize*3];
    while (1) {
        if (read(pipe[0], buffer, sizeof(buffer)) <= 0) {
            break;
        }
        if (strcmp(buffer, "STOP") == 0) {
            break;
        }
        fprintf(file, "%s", buffer);
    }
    fprintf(file, "---------------------------\n");
    fclose(file);

}
