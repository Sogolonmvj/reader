FROM openjdk:17
VOLUME /tmp
COPY target/*.jar reader.jar
ENTRYPOINT ["java", "-jar", "/reader.jar"]