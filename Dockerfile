FROM amazoncorretto:21-alpine-jdk


COPY target/demo-0.0.1-SNAPSHOT.jar /api-v1.jar


#CMD ["/bin/sh"]

ENTRYPOINT ["java","-jar","/api-v1.jar"]
