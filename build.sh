#!/bin/bash

mvn -f ./pnmlFw-Releng/pom.xml clean verify -Dmaven.javadoc.skip=true -Dmaven.test.skip=true 

