REM set the class path,
REM assumes the build was executed with maven copy-dependencies
SET BASE_CP=jobs4u.app.candidate.console\target\candidate.console-1.4.0-SNAPSHOT.jar;jobs4u.app.candidate.console\target\dependency\*;

REM call the java VM, e.g,
cd ../
java -classpath %BASE_CP% jobs4u.app.candidate.console.CandidateApp

cd scripts
