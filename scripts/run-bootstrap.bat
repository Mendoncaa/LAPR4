REM set the class path,
REM assumes the build was executed with maven copy-dependencies
SET BASE_CP=jobs4u.app.bootstrap\target\bootstrap-1.4.0-SNAPSHOT.jar;jobs4u.app.bootstrap\target\dependency\*;

REM call the java VM, e.g, 
cd ../
java -cp %BASE_CP% jobs4u.app.bootstrap.ExemploBootstrap

cd scripts