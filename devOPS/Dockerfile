FROM openjdk:17-jdk-slim AS build

# Set the working directory
WORKDIR /app

# Define the argument for the JAR file
ARG JAR_FILE=target/*.jar

# Copy the JAR file into the image
COPY ${JAR_FILE} app.jar

# Set the command to run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
