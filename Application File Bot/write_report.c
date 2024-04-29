#include <stdio.h>
#include <string.h>
#include <fcntl.h>
#include <unistd.h>
#include "write_report.h"

#define MAX_CHILDREN 6


void write_report(const char *report_data) {
    FILE *input_file, *output_file;
    char filename[20];
    char buffer[4096];

    output_file = fopen("final_report.txt", "w");
    if (output_file == NULL) {
        perror("Failed to open final_report.txt");
        return;
    }

    for (int i = 1; i <= MAX_CHILDREN; i++) {
        sprintf(filename, "output_%d.txt", i);

        input_file = fopen(filename, "r");
        if (input_file == NULL) {
            fprintf(stderr, "Failed to open %s\n", filename);
            continue;
        }

        while (fgets(buffer, sizeof(buffer), input_file) != NULL) {
            fputs(buffer, output_file);
        }

        fclose(input_file);
    }

    fclose(output_file);
}




