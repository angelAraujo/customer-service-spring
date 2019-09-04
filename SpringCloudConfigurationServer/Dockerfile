FROM openjdk
MAINTAINER Angel <maraujo0389@gmail.com>
ADD target/SpringCloudConfigurationServer-1.0-SNAPSHOT.jar containerized-spring-cloud-configuration-server.jar
ENTRYPOINT ["java", "-jar", "/containerized-spring-cloud-configuration-server.jar"]
EXPOSE 8888