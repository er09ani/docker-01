FROM openjdk:17-alpine
LABEL authors="er09ani"

RUN apk add maven

WORKDIR /app

COPY target/ServiceA-0.1.0.jar /app/ServiceA.jar

CMD ["java", "-jar", "ServiceA.jar"]