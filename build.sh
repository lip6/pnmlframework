#!/bin/bash

cd ./pnmlFw-Releng/
mvn clean package -Dmaven.javadoc.skip=true -Dmaven.test.skip=true
cd