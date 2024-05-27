# Crear imagen personalizada
FROM eclipse-temurin:22-jdk AS custom-maven
RUN apt-get update && apt-get install -y maven

# Etapa de construcción
FROM custom-maven AS build
COPY . .
RUN mvn clean package -DskipTests

# Etapa de ejecución
FROM eclipse-temurin:22-jdk
COPY --from=build /target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]