FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/aicodereview-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["sh", "-c", "java -jar app.jar --server.port=${PORT:-8080}"]
