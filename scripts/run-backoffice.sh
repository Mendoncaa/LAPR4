#!/usr/bin/env bash

export JOBS4U_CP=jobs4u.app.backoffice.console/target/backoffice.console-1.4.0-SNAPSHOT.jar:jobs4u.app.backoffice.console/target/dependency/*;

cd ../
java -cp $JOBS4U_CP jobs4u.app.backoffice.console.ExemploBackoffice
