#!/usr/bin/env bash

export JOBS4U_CP=jobs4u.app.costumer/target/jobs4u.app.costumer-0.1.0.jar:jobs4u.app.costumer/target/dependency/*;

java -cp $JOBS4U_CP app.costumer.apresentacao.MainMenu
