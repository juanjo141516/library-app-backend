# Etapa de construcción
FROM maven:3.8.5-openjdk-22 AS build
COPY . .
RUN mvn clean package -DskipTests

# Etapa de ejecución
FROM eclipse-temurin:22-jdk
COPY --from=build /target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]