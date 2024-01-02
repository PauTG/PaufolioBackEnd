
FROM amazoncorretto:8-alpine-jdk

copy target/portafolio-0.0.1-SNAPSHOT.jar argentina-developer.jar
entrypoint ["java","-jar","/PaufolioBackEnd.jar"]

CMD ["/bin/sh"]

