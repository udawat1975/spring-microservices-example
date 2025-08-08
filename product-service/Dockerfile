# Use an official OpenJDK 17 runtime as a base image
FROM openjdk:17-slim

# Set an argument for the JAR file's path
ARG JAR_FILE=target/*.jar

# Copy the built JAR file into the container at the root, renaming it to app.jar
COPY ${JAR_FILE} app.jar

# Tell Docker that the container will listen on this port at runtime
EXPOSE 8081

# The command to run when the container starts
ENTRYPOINT ["java","-jar","/app.jar"]
