#!/bin/sh
mvn clean package && docker build -t com.learnhow2code/CdiProducerMethods .
docker rm -f CdiProducerMethods || true && docker run -d -p 9080:9080 -p 9443:9443 --name CdiProducerMethods com.learnhow2code/CdiProducerMethods