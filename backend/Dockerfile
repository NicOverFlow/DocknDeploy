# Utilisation d'Ubuntu comme image de base
FROM ubuntu:20.04

# Mise à jour des paquets et installation de Java
RUN apt-get update && apt-get install -y openjdk-21-jdk

# Définir un ARG pour le fichier JAR
ARG JAR_FILE=target/*.jar

# Copier le fichier JAR de ton application
COPY ${JAR_FILE} /app.jar

# Exposer le port 8080
EXPOSE 8080

# Lancer l’application avec Java
CMD ["java", "-jar", "/app.jar"]