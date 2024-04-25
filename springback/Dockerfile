# java version 7
FROM openjdk:17-slim

# Set a working directory (optional)
WORKDIR /app

# Copy the Gradle wrapper and build script
COPY gradlew .
COPY gradlew.bat .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .

# Optionally copy your source code (if you plan to build inside the Docker container)
COPY src src

# Run Gradle build (optional if you've already built outside Docker)
RUN ./gradlew clean build

# Specify the path to the JAR file built by Gradle
#ARG JAR_FILE=./build/libs/*.jar
ARG JAR_FILE=./build/libs/springback-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# Expose the port your application uses
#EXPOSE 8080

# Define command to run your application
ENTRYPOINT ["java","-jar","app.jar"]
