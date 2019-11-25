FROM maven:3.6.2-jdk-13 AS build

COPY src /home/app/src
COPY pom.xml /home/app

RUN mvn -f /home/app clean package

FROM openjdk:13-jdk-slim

COPY --from=build /home/app/target/heroes-2.0.0-SNAPSHOT.jar /usr/local/lib/heroes.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/usr/local/lib/heroes.jar"]
