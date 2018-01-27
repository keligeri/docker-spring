FROM openjdk:8-jdk-alpine
ADD /target/docker-workshop-demo-2-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 9875
CMD ["java", "-jar", "app.jar"]
