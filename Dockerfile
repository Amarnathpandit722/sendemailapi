# Use an official Java runtime as the base image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the Spring Boot jar file to the container
COPY target/sendemailapi.jar sendemailapi.jar

# Expose the port Spring Boot will use
EXPOSE 8080

# Run the Spring Boot application with additional JVM settings for production (optional)
#ENTRYPOINT ["java", "-jar", "sendemailapi.jar"]

# Run the Spring Boot application
CMD ["java", "-jar", "sendemailapi.jar"]
