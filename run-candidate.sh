#!/usr/bin/env bash

export JOBS4U_CP=jobs4u.app.candidate/target/jobs4u.app.candidate-0.1.0.jar:jobs4u.app.candidate/target/dependency/*;

java -cp $JOBS4U_CP app.candidate.apresentacao.MainMenu
