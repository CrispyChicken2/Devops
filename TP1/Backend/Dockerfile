# Choose a lightweight Java JRE. 
# Alpine-based images are excellent for keeping the container size minimal.
FROM eclipse-temurin:22-jre-alpine

# Create and set the working directory inside the container
WORKDIR /app

# Add the compiled java (bytecode) from your host machine to the container
COPY Main.class /app/

# Run the Java application
CMD ["java", "Main"]