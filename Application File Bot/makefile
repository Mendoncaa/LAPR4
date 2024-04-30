CC = gcc
CFLAGS = -Wall -g
LDFLAGS = 
OBJFILES = main.o signal_handler.o monitoring_class.o worker.o process_file.o write_report.o
TARGET = application_bot

all: $(TARGET)

$(TARGET): $(OBJFILES)
	$(CC) $(CFLAGS) -o $(TARGET) $(OBJFILES) $(LDFLAGS)

main.o: main.c
	$(CC) $(CFLAGS) -c main.c

signal_handler.o: signal_handler.c
	$(CC) $(CFLAGS) -c signal_handler.c

monitoring_class.o: monitoring_class.c
	$(CC) $(CFLAGS) -c monitoring_class.c

worker.o: worker.c
	$(CC) $(CFLAGS) -c worker.c

process_file.o: process_file.c
	$(CC) $(CFLAGS) -c process_file.c

write_report.o: write_report.c
	$(CC) $(CFLAGS) -c write_report.c

clean:
	rm -f $(OBJFILES) $(TARGET)

.PHONY: all clean
