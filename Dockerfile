FROM openjdk:8
ADD target/docker-spring.jar docker-spring.jar
EXPOSE 1124
ENTRYPOINT ["java", "-jar", "docker-spring.jar"]