FROM openjdk:11
EXPOSE 8080
ADD target/docker-kuber.jar docker-kuber.jar
ENTRYPOINT ["java","-jar","/docker-kuber.jar"]