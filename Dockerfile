FROM openjdk:17-alpine
WORKDIR /app
COPY target/* app.jar
EXPOSE 8000
ENTRYPOINT ["java","-jar","app.jar"]