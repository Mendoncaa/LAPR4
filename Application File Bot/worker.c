#include "process_file.h" 
#include "worker.h" 
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>


void worker(const char *file_name, int child_id) {
    printf("Distributing %s to child %d\n", file_name, child_id);
    process_file(file_name, child_id);
}
