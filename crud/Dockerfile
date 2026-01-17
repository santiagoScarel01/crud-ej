# 1. Usamos una imagen de Java 17
FROM eclipse-temurin:17-jdk-jammy

# 2. El archivo .jar que generó Maven (asegúrate que el nombre coincida)
ARG JAR_FILE=target/crud-0.0.1-SNAPSHOT.jar

# 3. Lo copiamos dentro del contenedor con un nombre simple
COPY ${JAR_FILE} app.jar

# 4. Comando para arrancar la app
ENTRYPOINT ["java", "-jar", "/app.jar"]