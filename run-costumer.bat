REM set the class path,
REM assumes the build was executed with maven copy-dependencies
SET BASE_CP=jobs4u.app.costumer\target\jobs4u.app.costumer-0.1.0.jar;jobs4u.app.costumer\target\dependency\*;

REM call the java VM, e.g, 
java -classpath %BASE_CP% app.costumer.apresentacao.MainMenu
