#ifndef SIGNAL_HANDLER_H
#define SIGNAL_HANDLER_H

#include <signal.h>

void handle_signal_monitor(int signal);
void handle_SIGNINT(int signo);
void handle_SIGUSR1(int sig);
void handle_SIGUSR2(int num_sig, siginfo_t *info, void *context);

#endif 
