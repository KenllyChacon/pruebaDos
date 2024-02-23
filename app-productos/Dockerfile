# 1) docker build -t app-productos .
# 2) docker run -d --name productos01 -p 8080:8080 app-productos
# 3) docker tag app-productos darkenblue952518/app-productos
# 4) docker push darkenblue952518/app-productos
# 5) docker login

FROM eclipse-temurin:17.0.10_7-jre-alpine

RUN mkdir /app
WORKDIR /app

COPY build/quarkus-app/app ./app
COPY build/quarkus-app/lib ./lib
COPY build/quarkus-app/quarkus ./quarkus
COPY build/quarkus-app/quarkus-run.jar app.jar

CMD ["java","-jar","app.jar"]

