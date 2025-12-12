FROM eclipse-temurin:21-jdk

RUN apt-get update && \
    apt-get install -y maven && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

WORKDIR /activity-app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "target/spring-boot-activity-docker-0.0.1-SNAPSHOT.jar"]
