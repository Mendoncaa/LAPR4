#!/usr/bin/env bash

export JOBS4U_CP=jobs4u.app.backoffice/target/jobs4u.app.backoffice-0.1.0.jar:jobs4u.app.backoffice/target/dependency/*;

java -cp $JOBS4U_CP app.backoffice.apresentacao.MainMenu
