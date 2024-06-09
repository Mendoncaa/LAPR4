REM set the class path,
REM assumes the build was executed with maven copy-dependencies
SET BASE_CP=jobs4u.server\target\server-1.4.0-SNAPSHOT.jar;jobs4u.server\target\dependency\*;

REM call the java VM, e.g,
cd ../
java -classpath %BASE_CP% jobs4u.server.FollowupServer

cd scripts
