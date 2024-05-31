REM set the class path,
REM assumes the build was executed with maven copy-dependencies
SET BASE_CP=jobs4u.app.customer.console\target\customer.console-1.4.0-SNAPSHOT.jar;jobs4u.app.customer.console\target\dependency\*;

REM call the java VM, e.g, 
cd ../
java -classpath %BASE_CP% jobs4u.app.customer.console.OtherApp

cd scripts