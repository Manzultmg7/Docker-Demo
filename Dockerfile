FROM openjdk:21
EXPOSE 8080
ADD target/docker-github-action.jar docker-github-action.jar
ENTRYPOINT ["java", "-jar","/docker-github-action.jar"]