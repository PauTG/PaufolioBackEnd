FROM amazoncorretto:8-alpine-jdk

copy target/demo-0.0.1-SNAPSHOT.jar PaufolioBackEnd.jar
entrypoint ["java","-jar","/PaufolioBackEnd.jar"]

CMD ["/bin/sh"]

