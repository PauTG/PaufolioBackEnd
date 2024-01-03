FROM openjdk:8


copy target/demo-0.0.1-SNAPSHOT.jar pawli.jar
entrypoint ["java","-jar","/pawli.jar"]

CMD ["/bin/sh"]

