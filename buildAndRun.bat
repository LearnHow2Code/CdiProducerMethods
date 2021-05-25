@echo off
call mvn clean package
call docker build -t com.learnhow2code/CdiProducerMethods .
call docker rm -f CdiProducerMethods
call docker run -d -p 9080:9080 -p 9443:9443 --name CdiProducerMethods com.learnhow2code/CdiProducerMethods