FROM openjdk
MAINTAINER Angel <maraujo0389@gmail.com>
ADD /target/ZuulGatewayServer-1.0-SNAPSHOT.jar containerized-zuul-gateway-server.jar
ENTRYPOINT ["java", "-jar", "/containerized-zuul-gateway-server.jar"]
EXPOSE 8080