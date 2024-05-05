#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <sys/stat.h>
#include <dirent.h>
#include <regex.h>
#include <errno.h>

#define STR_MAX 255
#define PATH_MAX 4096

// Extracts the prefix from a filename up to the first dash character.
char *extract_prefix(const char *filename) {
    if (!filename) return NULL;
    const char *dash = strchr(filename, '-');
    if (!dash) return NULL;

    int length = dash - filename;
    char *prefix = malloc(length + 1);
    if (!prefix) {
        fprintf(stderr, "Failed to allocate memory for prefix\n");
        return NULL;
    }
    strncpy(prefix, filename, length);
    prefix[length] = '\0';
    return prefix;
}

// Generates a directory name using a line prefix and the output directory path.
char *generate_directory_name(const char *line, const char *output_dir) {
    if (!line || !output_dir) return NULL;
    size_t needed_size = strlen(output_dir) + strlen(line) + 2;
    char *dir_name = malloc(needed_size);
    if (!dir_name) {
        perror("Memory allocation failed for directory name");
        return NULL;
    }
    snprintf(dir_name, needed_size, "%s/%s", output_dir, line);
    return dir_name;
}

// Finds candidate files in a directory that match a specific pattern.
char** find_candidate_files(const char *directory, int *count) {
    DIR *dir = opendir(directory);
    if (!dir) {
        perror("Failed to open directory");
        return NULL;
    }

    regex_t regex;
    if (regcomp(&regex, "candidate-data\\.txt", REG_EXTENDED) != 0) {
        fprintf(stderr, "Could not compile regex\n");
        closedir(dir);
        return NULL;
    }

    char **files = NULL;
    *count = 0;
    int capacity = 10; // Initial capacity for the dynamic array of filenames
    files = malloc(capacity * sizeof(char*));

    struct dirent *ent;
    while ((ent = readdir(dir)) != NULL) {
        if (ent->d_type == DT_REG && regexec(&regex, ent->d_name, 0, NULL, 0) == 0) {
            if (*count >= capacity) {
                capacity *= 2;
                files = realloc(files, capacity * sizeof(char*));
            }
            files[*count] = malloc(strlen(directory) + strlen(ent->d_name) + 2);
            sprintf(files[*count], "%s/%s", directory, ent->d_name);
            (*count)++;
        }
    }
    closedir(dir);
    regfree(&regex);

    if (*count == 0) {
        fprintf(stderr, "No matching 'candidate-data.txt' file found in directory: %s\n", directory);
        free(files);
        return NULL;
    }
    return files;
}

// Retrieves the first line from a file, which is used as a directory name.
char *get_first_line(const char *file_path) {
    FILE *file = fopen(file_path, "r");
    if (!file) {
        perror("Unable to open the file");
        return NULL;
    }

    char *line = malloc(STR_MAX);
    if (!line) {
        fclose(file);
        return NULL;
    }

    if (!fgets(line, STR_MAX, file)) {
        free(line);
        fclose(file);
        return NULL;
    }

    line[strcspn(line, "\n")] = 0; // Remove newline character
    fclose(file);
    return line;
}

// Processes files in a directory by moving them to a new directory based on a prefix extracted from the file name.
void process_files(const char *path, const char *root_dir) {
    DIR *dir = opendir(path);
    if (!dir) {
        perror("Failed to open directory for processing files");
        return;
    }

    struct dirent *ent;
    while ((ent = readdir(dir)) != NULL) {
        if (ent->d_type == DT_REG) {
            char *prefix = extract_prefix(ent->d_name);
            if (prefix) {
                char *sub_dir = generate_directory_name(prefix, root_dir);
                if (sub_dir) {
                    if (mkdir(sub_dir, 0777) == -1 && errno != EEXIST) {
                        perror("Failed to create prefix directory");
                    }

                    char old_path[PATH_MAX], new_path[PATH_MAX];
                    snprintf(old_path, PATH_MAX, "%s/%s", path, ent->d_name);
                    snprintf(new_path, PATH_MAX, "%s/%s", sub_dir, ent->d_name);
                    if (rename(old_path, new_path) == -1) {
                        perror("Failed to move file");
                    } else {
                        printf("Successfully moved '%s' to '%s'\n", old_path, new_path);
                    }
                    free(sub_dir);
                }
                free(prefix);
            }
        }
    }
    closedir(dir);
}

// Main function for file processing. It finds candidate files and processes them.
void process_file(const char *input_directory, const char *output_directory) {
    int file_count = 0;
    char **candidate_files = find_candidate_files(input_directory, &file_count);
    if (!candidate_files) {
        fprintf(stderr, "No candidate files found in directory '%s'\n", input_directory);
        return;
    }

    for (int i = 0; i < file_count; i++) {
        char *first_line = get_first_line(candidate_files[i]);
        if (!first_line) {
            fprintf(stderr, "Failed to read the first line from '%s'\n", candidate_files[i]);
            continue;
        }

        char *root_dir = generate_directory_name(first_line, output_directory);
        if (root_dir && (mkdir(root_dir, 0777) != 0 && errno != EEXIST)) {
            perror("Failed to create root directory");
        } else {
            printf("Processing files in '%s' into directory '%s'\n", input_directory, root_dir);
            process_files(input_directory, root_dir);
        }

        free(candidate_files[i]);
        free(first_line);
        free(root_dir);
    }
    free(candidate_files);
}