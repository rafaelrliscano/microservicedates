FROM mauron/jdk:1.0
COPY ./target/microservice-dates-0.0.1-SNAPSHOT.jar root.jar
ENTRYPOINT ["java", "-jar", "root.jar"]
