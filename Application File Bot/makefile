CC=gcc
CFLAGS=-Wall -g
LDFLAGS=
EXEC=programa

SRC=main.c worker.c process_file.c write_report.c
OBJ=$(SRC:.c=.o)

all: $(EXEC)

$(EXEC): $(OBJ)
	$(CC) $(LDFLAGS) $^ -o $@

%.o: %.c./
	$(CC) $(CFLAGS) -c $< -o $@

clean:
	rm -f $(OBJ) $(EXEC)

.PHONY: all clean
