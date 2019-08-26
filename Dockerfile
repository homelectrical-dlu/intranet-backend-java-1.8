FROM openjdk:8
ADD target/he-backend-java.jar he-backend-java.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "he-backend-java.jar"]