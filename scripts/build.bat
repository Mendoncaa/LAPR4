ECHO OFF
ECHO make sure JAVA_HOME is set to JDK folder
ECHO make sure maven is on the system PATH
cd ../
call mvn %1 dependency:copy-dependencies package -DskipTests -Dmaven.javadoc.skip=true
cd scripts

