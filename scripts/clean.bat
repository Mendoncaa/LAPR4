ECHO OFF
ECHO make sure JAVA_HOME is set to JDK folder
ECHO make sure maven is on the system PATH

cd ../

REM Clean the project using Maven
call mvn clean
cd scripts