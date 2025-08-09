# Use a small JRE image
FROM openjdk:17-slim

# Accept a jar path like target/*.jar
ARG JAR_FILE=target/*.jar

# Copy the built jar
COPY ${JAR_FILE} app.jar

# Eureka dashboard port
EXPOSE 8761

# (Optional) Tune JVM memory for small pods
ENV JAVA_OPTS="-Xms128m -Xmx512m"

# Run
ENTRYPOINT ["sh","-c","java $JAVA_OPTS -jar /app.jar"]
