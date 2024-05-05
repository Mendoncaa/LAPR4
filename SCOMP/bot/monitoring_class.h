#ifndef MONITORING_CLASS_H
#define MONITORING_CLASS_H

void monitor_directory(const char *directory_path, int pid);
void handle_signal_monitor(int signal);

#endif
