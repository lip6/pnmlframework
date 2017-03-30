#!/bin/bash

cd ./pnmlFw-Releng/
mvn clean generate-sources install -Dmaven.javadoc.skip=true -Dmaven.test.skip=true
cd