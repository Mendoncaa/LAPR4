#ifndef PROCESS_FILE_H
#define PROCESS_FILE_H

char *generate_file_name(char *directory_path, int str_max, char *output_file);
void process_file(int pipe[], int str_pipe[], const char *path, int str_max, char *output_file, int num);

#endif
