REM set the class path,
REM assumes the build was executed with maven copy-dependencies
SET BASE_CP=jobs4u.app.backoffice.console\target\backoffice.console-1.4.0-SNAPSHOT.jar;jobs4u.app.backoffice.console\target\dependency\*;

REM call the java VM, e.g, 
cd ../
java -classpath %BASE_CP% jobs4u.app.backoffice.console.ExemploBackoffice
