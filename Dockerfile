FROM openjdk:17-jdk-slim-buster
MAINTAINER marcbarbosa
COPY /build/libs/ec2-self-learn-0.0.1-SNAPSHOT.jar /app/app.jar
WORKDIR /app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]