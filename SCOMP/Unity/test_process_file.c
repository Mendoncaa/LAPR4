#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include "process_file.h" 


void assert(int test, const char *message) {
    if (!test) {
        printf("Test failed: %s\n", message);
        exit(1);
    }
}

void test_extract_prefix() {
    char *filename = "test-file-data.txt";
    char *expected_prefix = "test";
    char *prefix = extract_prefix(filename);
    assert(prefix != NULL && strcmp(prefix, expected_prefix) == 0, "extract_prefix does not match expected output");
    free(prefix);
}

void test_generate_directory_name() {
    char *line = "data";
    char *output_dir = "/var/output";
    char expected_dir_name[1024];
    sprintf(expected_dir_name, "%s/%s", output_dir, line);
    
    char *dir_name = generate_directory_name(line, output_dir);
    assert(dir_name != NULL && strcmp(dir_name, expected_dir_name) == 0, "generate_directory_name does not match expected output");
    free(dir_name);
}

void test_get_first_line() {
    const char *testFilePath = "/tmp/testfile.txt";
    FILE *f = fopen(testFilePath, "w");
    fprintf(f, "First Line\nSecond Line\n");
    fclose(f);

    char *line = get_first_line(testFilePath);
    assert(strcmp(line, "First Line") == 0, "get_first_line should return the first line of the file");

    free(line);
    remove(testFilePath); // Clean up
}

void test_find_candidate_files() {
    const char *testDirPath = "/tmp/testdir";
    mkdir(testDirPath, 0777);

    // Create a mix of matching and non-matching files
    const char *fileNames[] = {"candidate-data.txt", "another-data.txt", "candidate-data.doc"};
    size_t fileCount = sizeof(fileNames) / sizeof(fileNames[0]);
    for (size_t i = 0; i < fileCount; i++) {
        char filePath[256];
        sprintf(filePath, "%s/%s", testDirPath, fileNames[i]);
        FILE *f = fopen(filePath, "w");
        fprintf(f, "Some content");
        fclose(f);
    }

    int foundCount = 0;
    char **foundFiles = find_candidate_files(testDirPath, &foundCount);
    assert(foundCount == 1, "find_candidate_files should find exactly one matching file");

    for (int i = 0; i < foundCount; i++) {
        free(foundFiles[i]);
    }
    free(foundFiles);

    // Cleanup
    for (size_t i = 0; i < fileCount; i++) {
        char filePath[256];
        sprintf(filePath, "%s/%s", testDirPath, fileNames[i]);
        remove(filePath);
    }
    rmdir(testDirPath);
}



int main() {
    test_extract_prefix();
    test_generate_directory_name();
    test_get_first_line();
	test_find_candidate_files();
    printf("All tests passed successfully.\n");
    return 0;
}