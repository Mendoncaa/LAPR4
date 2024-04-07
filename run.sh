#!/usr/bin/env bash

export JOBS4U_CP=jobs4u.app1/target/jobs4u.app1-0.1.0.jar:jobs4u.app1/target/dependency/*;

java -cp $JOBS4U_CP apresentacao.MainMenu
