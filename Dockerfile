FROM openjdk:17
EXPOSE 8080
ADD target/spring-action.jar spring-action.jar
ENTRYPOINT ["java","-jar","/spring-action.jar"]