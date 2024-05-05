#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include "monitoring_class.h" 


void assert(bool condition, const char *message) {
    if (!condition) {
        printf("Test failed: %s\n", message);
        exit(1);
    }
}

void test_existFile() {
    
    bool result = test_existFile("/tmp/testdir");
    assert(result == false, "existFile should return false for empty directories");
}

int main() {
    test_existFile();
    printf("All monitoring class tests passed successfully.\n");
    return 0;
}
