FROM eclipse-temurin:17-jre-alpine
LABEL authors="renz.ayala"

COPY ./bankingMsClients-0.0.1-SNAPSHOT.jar ./ms-clients.jar
EXPOSE 11101

ENTRYPOINT ["java", "-Duser.timezone=America/Lima", "-jar", "ms-clients.jar"]

## .\gradlew clean build -x test --no-daemon
## cp .\build\libs\bankingMsClients-0.0.1-SNAPSHOT.jar  .\src\main\docker\
## cd .\src\main\docker\
## docker container stop ms-clients
## docker build . -t bank/ms-clients:latest
## docker run -d --rm --name ms-clients --env-file .env -p 11101:11101 bank/ms-clients:latest