#!/bin/bash

# Start the application in the background
./application_bot &
APP_PID=$!

# Wait for the app to initialize
sleep 5

# Send files to the input directory
cp valid_input.txt /test/input/
sleep 5
cp restricted.txt /test/input/

# Test signal handling
kill -SIGINT $APP_PID
wait $APP_PID

# Check outputs
echo "Testing complete. Review the logs and output files."
