# Use an appropriate base image based on your Java version
FROM openjdk:11-jre-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file
COPY target/shop-service-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your application is using
EXPOSE 8080

# Command to run your application
CMD ["java", "-jar", "app.jar"]


#docker build -t your-image-name:tag .


#docker run -p 8080:8080 your-image-name:tag