FROM openjdk:8
EXPOSE 8080
ADD target/kube-hello-world-0.0.1-SNAPSHOT.jar kube-hello-world.jar
ENTRYPOINT [ "java", "-jar", "/kube-hello-world.jar" ]