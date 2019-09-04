FROM openjdk
MAINTAINER Angel <maraujo0389@gmail.com>
ADD /target/EurekaDiscoveryServer-1.0-SNAPSHOT.jar containerized-eureka-discovery-server.jar
ENTRYPOINT ["java", "-jar", "/containerized-eureka-discovery-server.jar"]
EXPOSE 8761