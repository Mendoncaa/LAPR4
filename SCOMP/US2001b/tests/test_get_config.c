#include "config.h"
#include <assert.h>
#include <string.h>

void test_get_config() {
    config cfg;
    char *argv[] = {"file_bot", "../Email_Bot_Shm/", "../File_Report_Shm/", "5", "10"};
    get_config(&cfg, 5, argv);

    assert(strcmp(cfg.input_path, "../Email_Bot_Shm/") == 0);
    assert(strcmp(cfg.output_path, "../File_Report_Shm/") == 0);
    assert(cfg.number_of_workers == 5);
    assert(cfg.watcher_interval == 10);

    printf("get_config passed\n");
}

int main() {
    test_get_config();
    return 0;
}
