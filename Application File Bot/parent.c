#include <dirent.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <sys/types.h>
#include <signal.h>
#include <limits.h>

// Struct File
typedef struct {        
    char **filenameArray;
    char *data;
    int size;
    int address;
} file_dataList;


// Struct ListFile
typedef struct {
    file_dataList **fileList;
    int size;
} ListFile_data;

void addNewListFile(ListFile_data *listFile, file_dataList *file) {
    listFile->size++;
    listFile->fileList = realloc(listFile->size, listFile->size * sizeof(file_dataList));
    if (listFile->fileList == NULL) {
        perror("ERROR: Failed to allocate memory for listFile");
        kill(getpid(), SIGINT);
        exit(EXIT_FAILURE);
    }
    listFile->fileList[listFile->size - 1] = file;
}

file_dataList *createFileDataList(int address, const char *initialFile) {
    file_dataList *newFile = calloc(1,sizeof(file_dataList *));
    if (newFile == NULL) {
        perror("ERROR: Failed to allocate memory for newFile");
        kill(getpid(), SIGINT);
        exit(EXIT_FAILURE);
    }
    
    newList->filenameArray = malloc(sizeof(char *));
    if (newList->filenameArray == NULL) {
        perror("ERROR: Failed to allocate memory for filenameArray");
        free(newList);
        kill(getpid(), SIGINT);
        exit(EXIT_FAILURE);
    }

    newList->address = address;
    newList->filenameArray[0] = malloc((strlen(initFile) + 1) * sizeof(char));
    if (newList->filenameArray[0] == NULL) {
        perror("ERROR: Failed to allocate memory for filenameArray[0]");
        free(newList->filenameArray);
        free(newList);
        kill(getpid(), SIGINT);
        exit(EXIT_FAILURE);
    }

    strcpy(newList->filenameArray[0], initFile);
    newList->size = 1;
    return newList;
}

void addNewFileName(file_dataList *file_list, const char *new_file_name, int max) {
    
    file_list->size++;
    file_list->filenameArray = realloc(file_list->filenameArray, file_list->size * sizeof(char *));

    if (file_list->filenameArray == NULL) {
        perror("ERROR: Failed to allocate memory for filenameArray");
        kill(getpid(), SIGINT);
        exit(EXIT_FAILURE);
    }

    FILE * file = fopen(new_file_name, "r");
    if (strstr(new_file_name, "-applicant_data.txt")) {
        FILE * file = fopen(new_file_name, "r");

        if (file = NULL) {
            perror("ERROR: Failed to open file");
            kill(getpid(), SIGINT);
            exit(EXIT_FAILURE);
        }

        char line[max];
        char position[max];

        fgets(line, max, file);
        strcpy(position, strtok(line, "\n"));
        fclose(file);

        file_list->position = malloc(max);
        strcpy(file_list->position, position);
    }

    file_list->filenameArray[file_list->size - 1] = malloc((strlen(new_file_name) + 1) * sizeof(char));
    if (file_list->filenameArray[file_list->size - 1] == NULL) {
        perror("ERROR: Failed to allocate memory for filenameArray[file_list->size - 1]");
        kill(getpid(), SIGINT);
        exit(EXIT_FAILURE);
    }
    strcpy(file_list->filenameArray[file_list->size - 1], new_file_name);
}

file_dataList *findFileList(ListFile_data *listFile, int token) {
    for (int i = 0; i < listFile->size; i++) {
        if (listFile->fileList[i]->address == token) {
            return listFile->fileList[i];
        }
    }
    return NULL;
}

ListFile_data *countListNewFile(const char *dir, int string_max, int max_size) {
    DIR *path;

    struct dirent *entry;

    path = opendir(dir);

    if (path == NULL) {
        perror("ERROR: Failed to found parent directory");
        kill(getpid(), SIGUSR1);
        exit(EXIT_FAILURE);
    }

    ListFile_data *listFile = calloc(1, sizeof(ListFile_data));
    if (listFile == NULL) {
        perror("ERROR: Failed to allocate memory for listFile");
        kill(getpid(), SIGUSR1);
        exit(EXIT_FAILURE);
    }

    listFile->size = 0;
    if (path) {
        while ((entry = readdir(path)) != NULL) {
            if (entry->d_type == DT_REG) {
                char *file_name = malloc((string_max) * sizeof(char));
                if (file_name != NULL) {
                    sprintf(file_name, "%s/%s", "../emailBotIntput", entry->d_name);
                    char *token = strtok(entry->d_name, "_");
                    int address = atoi(token);

                    file_dataList *file_found_list = findFileList(listFile, address);

                    if (file_found_list == NULL) {
                        file_dataList *newList = createFileDataList(address, file_name);
                        addNewListFile(listFile, newList);
                    } else {
                        addNewFileName(newList, file_name, string_max);
                    }
                }
            }
        }
    }

    closedir(path);

    return listFile;
}

int allocateFile(int num_childs, int pipes[][2], const char *path, int str_max, int *child_status) {

    ListFile_data *files = countListNewFile(path, str_max,str_max);

    if (files == NULL) {
        printf("Error: Unable count and list new files\n");
        kill(getpid(), SIGUSR1);
        exit(EXIT_FAILURE);
    }

    int aux = 0;
    int num_child = 0;

    while(files->size > aux) {

        if(child_status[num_child] == 0) {
            int num_files = files->list[aux]->size;
            char num_files_string[str_max];
            sprintf(num_files_string, "%d", num_files);

            strcat(num_files_string,"/");
            strcat(num_files_string,files->list[aux]->data);
            strcat(num_files_string,"/");

            write(pipes[num_child][1], num_files_string, str_max);

            free(files->list[aux]->data);

            int num = 0;
            for(int j = 0; j < files->list[aux]->size; j++) {


                if (files->list[aux]->filesArray[j] != NULL) {
                       write(pipes[num_child][1], files->list[aux]->filesArray[j], str_max);
                       num++;
                       if(child_status[num_child] == 0) {
                            child_status[num_child] = 1;
                       }
                }
            }
            aux++;

        } else {
            num_child++;
            if(num_child == num_childs) {
                num_child = 0;
            }

        }
    }

    for(int i = 0; i < num_childs; i++) {
          int num_files = -1;
          char num_files_string[str_max];
          sprintf(num_files_string, "%d", num_files);
          write(pipes[i][1], num_files_string, str_max);


    }

    for (int i = 0; i < files->size; ++i) {
        file_dataList *file_dataList = files->list[i];
        if (file_dataList != NULL) {
            for (int j = 0; j < file_dataList->size; ++j) {
                free(file_dataList->filesArray[j]);
            }
            free(file_dataList->filesArray);
            free(file_dataList);
            files->list[i] = NULL; // Set to NULL after freeing
        }
    }

    free(files->list);
    free(files);

    return 5; // return 5 ?  why 5?

