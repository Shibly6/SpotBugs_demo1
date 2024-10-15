# Use an official OpenJDK image as the base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file into the container
COPY target/SpotBugs_demo-0.0.1-SNAPSHOT.jar app.jar

# Expose the port on which the application will run
EXPOSE 8888

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
