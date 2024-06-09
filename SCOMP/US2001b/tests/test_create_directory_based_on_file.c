#include "worker.h"
#include "config.h"
#include <assert.h>
#include <string.h>

void test_create_directory_based_on_file() {
    job j;
    config cfg;
    snprintf(cfg.input_path, MAX_PATH_LENGTH, "../Email_Bot_Shm/");
    snprintf(cfg.output_path, MAX_PATH_LENGTH, "../File_Report_Shm/");
    create_directory_based_on_file(&j, 123, &cfg, 0);

    assert(strcmp(j.output_directory, "../File_Report_Shm") == 0);

    printf("create_directory_based_on_file passed\n");
}

int main() {
    test_create_directory_based_on_file();
    return 0;
}
