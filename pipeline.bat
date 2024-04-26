REM set the class path,
REM assumes the build was executed with maven copy-dependencies

call mvn clean

call mvn %1 dependency:copy-dependencies package

call run-backoffice.bat
