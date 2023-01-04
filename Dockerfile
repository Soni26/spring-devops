FROM openjdk:11-jdk-slim
VOLUME /tmp
ADD target/devops-spring-0.0.1-SNAPSHOT.jar devops-spring.jar
ENTRYPOINT ["java", "-jar", "devops-spring.jar"]