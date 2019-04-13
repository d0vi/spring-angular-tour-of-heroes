FROM maven:3.6.0-jdk-8 AS build

COPY src /home/app/src
COPY pom.xml /home/app

RUN mvn -f /home/app clean package

FROM openjdk:8-stretch

COPY --from=build /home/app/target/heroes-1.0.0.jar /usr/local/lib/heroes.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/usr/local/lib/heroes.jar"]
