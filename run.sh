#!/bin/bash

mvn clean package &&java -jar target/dependency/jetty-runner.jar target/*.war
