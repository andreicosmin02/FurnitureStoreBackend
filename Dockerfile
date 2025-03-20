# Use OpenJDK image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the application JAR file
COPY target/FurnitureStore-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
