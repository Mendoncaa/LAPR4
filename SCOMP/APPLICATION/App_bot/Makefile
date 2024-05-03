# Compiler settings - Can change to cc, gcc, clang, etc.
CC = gcc

# Compiler flags
CFLAGS = -Wall -g

# Linker flags
LDFLAGS =

# Source files
SOURCES = main.c parent.c process_file.c monitoring_class.c signal_handler.c write_report.c

# Object files
OBJECTS = $(SOURCES:.c=.o)

# Executable name
EXECUTABLE = program

# Path settings
EMAIL_BOT_PATH = /home/guest/Documents/APPLICATION/Email_Bot
ALARM_SETTING = 10
NUM_CHILDS = 5
OUTPUT_DIR = /home/guest/Documents/APPLICATION/File_Report

# Default target
all: $(EXECUTABLE)

# Link objects into the executable
$(EXECUTABLE): $(OBJECTS)
	$(CC) $(LDFLAGS) -o $@ $^

# Compile source files into objects
%.o: %.c
	$(CC) $(CFLAGS) -c $<

# Clean target
clean:
	rm -f $(OBJECTS) $(EXECUTABLE)

# Run the program with specified arguments
run:
	./$(EXECUTABLE) $(EMAIL_BOT_PATH) $(ALARM_SETTING) $(NUM_CHILDS) $(OUTPUT_DIR)

# Dependencies
main.o: main.c parent.h monitoring_class.h process_file.h write_report.h signal_handler.h
parent.o: parent.c parent.h process_file.h signal_handler.h
process_file.o: process_file.c process_file.h
monitoring_class.o: monitoring_class.c monitoring_class.h signal_handler.h
signal_handler.o: signal_handler.c signal_handler.h
write_report.o: write_report.c write_report.h

.PHONY: all clean run

