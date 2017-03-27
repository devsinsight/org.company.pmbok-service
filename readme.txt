to create a docker base image for spring boot use: frolvlad/alpine-oraclejdk8:slim
then replace for your image

build: gradlew build && java -jar build/libs/org.company.pmbok-service.jar
buildDocker: gradlew buildDocker
tag: docker tag org.company/org.company.pmbok-service:latest orgcompany/orgcompany.pmbok:latest
push: docker push orgcompany/orgcompany.pmbok:latest

check if port is using: netstat -ano | find "8080"
kill process: taskkill /F /PID [PID_NUMBER]