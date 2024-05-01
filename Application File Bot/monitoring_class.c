#include <stdio.h>
#include <stdlib.h>
#include <dirent.h>
#include <signal.h>
#include <stdbool.h>
#include <string.h>
#include <unistd.h>

#include "signal_handler.h"
#include "process_file.h"


bool existFile(const char *filename) {
	DIR *path;
	struct dirent *entry;

	path = opendir(filename);

	if (entry == NULL) {
		perror("ERROR: No such file or directory\n");
		return false;
	}

	if (path) {
		while ((entry = readdir(path)) != NULL) {
			if (entry->d_type == DT_REG) {
				return true;
			}
		}
	}

	closedir(path);
	return false;
}

void monitor_directory(const char *directory_path, int pid) {
	
	if (existFile(directory_path)) {
		kill(pid, SIGURS1);

	} else {
		printf("ERROR: No files founded\n");
	}
}

void handle_signal_monitor(int signal) {
	printf("Signal received: %d\n", signal);
}

int main (int argc, char *argv[]) {

	int time = atoi(argv[1]);
	const char *directory_path = argv[2];
	int pid = atoi(argv[3]); 

	struct sigaction act;
	memset(&act, 0, sizeof(struct sigaction));
	act.sa_handler = handle_signal_monitor;
	sigaction(SIGALRM, &act, NULL);
	
	while (1) {
		alarm(time);
		pause();
		monitor_directory(directory_path, pid);
	}

	return 0;
}