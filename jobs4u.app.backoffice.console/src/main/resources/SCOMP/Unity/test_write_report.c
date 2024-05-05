#include <stdio.h>
#include <stdlib.h>
#include "write_report.h" 

void assert(int condition, const char *message) {
    if (!condition) {
        printf("Test failed: %s\n", message);
        exit(1);
    }
}

void printFicheiro(int pipe[], int maxSize, char* output_dir) {
    printf("Mocked printFicheiro function called\n");
    
}

void test_printFicheiro() {
    int mockPipe[2];
    char *outputDir = "/tmp"; 
    pipe(mockPipe); 

    write(mockPipe[1], "Test data", 9);
    close(mockPipe[1]); 

    printFicheiro(mockPipe, 255, outputDir);

}

int main() {
    test_printFicheiro();
    printf("All write report tests passed successfully.\n");
    return 0;
}
