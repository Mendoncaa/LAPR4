#include <stdio.h>
#include <stdlib.h>
#include <dirent.h>
#include <string.h>
#include <unistd.h>
#include <sys/types.h>
#include <signal.h>
#include <limits.h>

// Definitions of data structures for file management
typedef struct {
    char **filenameArray;
    int size;
    int address;
} file_dataList;

typedef struct {
    file_dataList **fileList;
    int size;
} ListFile_data;

void addNewListFile(ListFile_data *listFile, file_dataList *file);
file_dataList *createFileDataList(int address, const char *initialFile);
void addNewFileName(file_dataList *file_list, const char *new_file_name);
file_dataList *findFileList(ListFile_data *listFile, int token);
ListFile_data *countListNewFile(const char *dir, int string_max);
int allocateFile(int num_childs, int pipes[][2], const char *path, int str_max, int *child_status);

// Adds a new file list to the list of file data
void addNewListFile(ListFile_data *listFile, file_dataList *file) {
    listFile->size++;
    listFile->fileList = realloc(listFile->fileList, listFile->size * sizeof(file_dataList *));
    if (listFile->fileList == NULL) {
        perror("ERROR: Failed to allocate memory for listFile");
        kill(getpid(), SIGINT);
        exit(EXIT_FAILURE);
    }
    listFile->fileList[listFile->size - 1] = file;
}

// Creates a new file data list with an initial file and address
file_dataList *createFileDataList(int address, const char *initialFile) {
    file_dataList *newFile = calloc(1, sizeof(file_dataList));
    if (newFile == NULL) {
        perror("ERROR: Failed to allocate memory for newFile");
        kill(getpid(), SIGINT);
        exit(EXIT_FAILURE);
    }

    newFile->filenameArray = malloc(sizeof(char *));
    if (newFile->filenameArray == NULL) {
        perror("ERROR: Failed to allocate memory for filenameArray");
        free(newFile);
        kill(getpid(), SIGINT);
        exit(EXIT_FAILURE);
    }

    newFile->filenameArray[0] = strdup(initialFile);
    if (newFile->filenameArray[0] == NULL) {
        perror("ERROR: Failed to allocate memory for filenameArray[0]");
        free(newFile->filenameArray);
        free(newFile);
        kill(getpid(), SIGINT);
        exit(EXIT_FAILURE);
    }

    newFile->size = 1;
    newFile->address = address;
    return newFile;
}

// Adds a new file name to an existing file data list
void addNewFileName(file_dataList *file_list, const char *new_file_name) {
    file_list->size++;
    file_list->filenameArray = realloc(file_list->filenameArray, file_list->size * sizeof(char *));
    if (file_list->filenameArray == NULL) {
        perror("ERROR: Failed to allocate memory for filenameArray");
        kill(getpid(), SIGINT);
        exit(EXIT_FAILURE);
    }

    file_list->filenameArray[file_list->size - 1] = strdup(new_file_name);
    if (file_list->filenameArray[file_list->size - 1] == NULL) {
        perror("ERROR: Failed to allocate memory for new filename");
        exit(EXIT_FAILURE);
    }
}

// Finds a file list by its address identifier
file_dataList *findFileList(ListFile_data *listFile, int token) {
    for (int i = 0; i < listFile->size; i++) {
        if (listFile->fileList[i]->address == token) {
            return listFile->fileList[i];
        }
    }
    return NULL;
}

// Counts new files in a directory and categorizes them into lists based on a naming convention
ListFile_data *countListNewFile(const char *dir, int string_max) {
    DIR *path = opendir(dir);
    if (path == NULL) {
        perror("ERROR: Failed to find parent directory");
        kill(getpid(), SIGUSR1);
        exit(EXIT_FAILURE);
    }

    ListFile_data *listFile = calloc(1, sizeof(ListFile_data));
    if (listFile == NULL) {
        perror("ERROR: Failed to allocate memory for listFile");
        kill(getpid(), SIGUSR1);
        exit(EXIT_FAILURE);
    }

    struct dirent *entry;
    while ((entry = readdir(path)) != NULL) {
        if (entry->d_type == DT_REG) {
            char *file_name = malloc((string_max) * sizeof(char));
            if (file_name == NULL) {
                perror("ERROR: Failed to allocate memory for file name");
                closedir(path);
                kill(getpid(), SIGUSR1);
                exit(EXIT_FAILURE);
                }
            sprintf(file_name, "%s/%s", dir, entry->d_name);
            char *token_str = strtok(entry->d_name, "_");
            int address = atoi(token_str);

            file_dataList *file_found_list = findFileList(listFile, address);
            if (file_found_list == NULL) {
                file_dataList *newList = createFileDataList(address, file_name);
                addNewListFile(listFile, newList);
            } else {
                addNewFileName(file_found_list, file_name);
            }
            free(file_name);
        }
    }
    closedir(path);
    return listFile;
}

// Allocates files to child processes through pipes based on their availability and status
int allocateFile(int num_childs, int pipes[][2], const char *path, int str_max, int *child_status) {
    ListFile_data *files = countListNewFile(path, str_max);

    if (files == NULL) {
        printf("Error: Unable to count and list new files\n");
        kill(getpid(), SIGUSR1);
        exit(EXIT_FAILURE);
    }

    int aux = 0;
    int num_child = 0;
    while (files->size > aux) {
        if (child_status[num_child] == 0) {
            int num_files = files->fileList[aux]->size;
            char num_files_string[str_max];
            sprintf(num_files_string, "%d", num_files);

            strcat(num_files_string, "/");
            strcat(num_files_string, files->fileList[aux]->filenameArray[0]);
            strcat(num_files_string, "/");

            write(pipes[num_child][1], num_files_string, str_max);

            for (int j = 0; j < files->fileList[aux]->size; j++) {
                if (files->fileList[aux]->filenameArray[j] != NULL) {
                    write(pipes[num_child][1], files->fileList[aux]->filenameArray[j], str_max);
                    child_status[num_child] = 1;
                }
            }
            aux++;
        } else {
            num_child++;
            if (num_child == num_childs) {
                num_child = 0;
            }
        }
    }

    for (int i = 0; i < num_childs; i++) {
        int num_files = -1;
        char num_files_string[str_max];
        sprintf(num_files_string, "%d", num_files);
        write(pipes[i][1], num_files_string, str_max);
    }

    for (int i = 0; i < files->size; i++) {
        file_dataList *file_dataList = files->fileList[i];
        if (file_dataList != NULL) {
            for (int j = 0; j < file_dataList->size; j++) {
                free(file_dataList->filenameArray[j]);
            }
            free(file_dataList->filenameArray);
            free(file_dataList);
        }
    }
    free(files->fileList);
    free(files);

    return 0; // Return 0 for successful completion
}
