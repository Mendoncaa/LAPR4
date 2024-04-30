#include <stdio.h>
#include <stdlib.h>
#include <string.h>


void write_report(const char *report_data) {
    char filename[50];
    FILE *output_file, *input_file;
    char buffer[1024];

    
    output_file = fopen("final_report.txt", "w");
    if (output_file == NULL) {
        perror("Failed to open final_report.txt");
        return;
    }

    for (int i = 0; i < 6; i++) { 
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
