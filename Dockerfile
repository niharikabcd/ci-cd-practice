#base docker image
FROM openjdk:21
LABEL maintainer='docker-demo'
ADD target/springboot-image.jar springb-docker-demooot-image.jar
ENTRYPOINT [ "java","-jar","/springboot-image.jar" ]