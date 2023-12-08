FROM openjdk:17
ARG JAR_FIL=target/*.jar
COPY ${JAR_FIL} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]