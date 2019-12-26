#!/bin/sh
java -Djava.security.egd=file:/dev/./urandom -Denv_var=$ENV_VAR -jar /app/application.jar