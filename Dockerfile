## Use official OpenJDK image as a parent
#FROM openjdk:17-jdk-slim
#
## Set working directory
##WORKDIR /app
#
## Copy built jar to the container
##COPY target/web-service-0.0.1-SNAPSHOT.jar app.jar
## Copy the built JAR file into the container # . for current directory
#COPY target/docker-assignment-advanced.jar .
#
## Expose port 8080
#EXPOSE 8080
#
## Run the application
#ENTRYPOINT ["java", "-jar", "docker-assignment-advanced.jar"]

# Stage 1: Build the application
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Create the runtime image
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/docker-assignment-advanced.jar .
RUN useradd -m appuser
USER appuser
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "docker-assignment-advanced.jar"]
