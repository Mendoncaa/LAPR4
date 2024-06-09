#include "worker.h"
#include "config.h"
#include <assert.h>
#include <string.h>

void test_generate_worker_report() {
    job j;
    config cfg;
    snprintf(cfg.output_path, MAX_PATH_LENGTH, "../File_Report_Shm/");
    j.prefix = 123;
    j.length = 1;
    snprintf(j.output_directory, MAX_PATH_LENGTH, "IBM-000123");
    snprintf(j.copied_files[0], MAX_PATH_LENGTH, "2-candidate.data.txt");

    // Simular a criação do diretório de saída
    system("mkdir -p ../File_Report_Shm");

    generate_worker_report(&j, &cfg);

    // Verifica se o relatório foi gerado corretamente
    FILE *file = fopen("../File_Report_Shm/report.csv", "r");
    assert(file != NULL);
    char line[256];
    fgets(line, sizeof(line), file);
    assert(strstr(line, "2-candidate.data.txt") != NULL);
    fclose(file);

    // Limpar arquivos e diretórios criados para o teste
    system("rm -rf ../File_Report_Shm");

    printf("generate_worker_report passed\n");
}

int main() {
    test_generate_worker_report();
    return 0;
}
