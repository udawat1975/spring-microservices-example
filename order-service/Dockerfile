FROM openjdk:17-slim

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Change if your order-service listens on a different port
EXPOSE 8082

ENV JAVA_OPTS="-Xms128m -Xmx512m"
ENTRYPOINT ["sh","-c","java $JAVA_OPTS -jar /app.jar"]
