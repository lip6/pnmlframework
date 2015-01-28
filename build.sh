#!/bin/bash

mvn -f ./pnmlFw-Releng/pom.xml clean package -Dmaven.javadoc.skip=true -Dmaven.test.skip=true
