# 1) docker build -t app-clientes .
# 2) docker run -d --name clientes01 -p 8080:8080 app-clientes
# 3) docker tag app-clientes darkenblue952518/app-clientes
# 4) docker push darkenblue952518/app-clientes
# 5) docker login

FROM eclipse-temurin:17.0.10_7-jre-alpine

RUN mkdir /app
WORKDIR /app

COPY build/quarkus-app/app ./app
COPY build/quarkus-app/lib ./lib
COPY build/quarkus-app/quarkus ./quarkus
COPY build/quarkus-app/quarkus-run.jar app.jar

CMD ["java","-jar","app.jar"]

