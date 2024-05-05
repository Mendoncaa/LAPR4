#ifndef PROCESS_FILE_H
#define PROCESS_FILE_H


char *extract_prefix(const char *filename);
char *generate_directory_name(const char *line, const char *output_dir);
char **find_candidate_files(const char *directory, int *count);
char *get_first_line(const char *file_path);
void process_files(const char *path, const char *root_dir);
void process_file(const char *input_directory, const char *output_directory);

#endif
