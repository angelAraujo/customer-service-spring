FROM java:8
MAINTAINER Angel <maraujo0389@gmail.com>
ADD /EurekaDiscoveryServer/target/EurekaDiscoveryServer-1.0-SNAPSHOT.jar containerized-EurekaDiscoveryServer.jar
ADD /SpringCloudConfigurationServer/target/SpringCloudConfigurationServer-1.0-SNAPSHOT.jar containerized-SpringCloudConfigurationServer.jar
ADD /ZuulGatewayServer/target/ZuulGatewayServer-1.0-SNAPSHOT.jar containerized-ZuulGatewayServer.jar
ADD /CustomerService/target/Customers-1.0-SNAPSHOT.jar containerized-Customers.jar
ENTRYPOINT ["java", "-jar", "/containerized-EurekaDiscoveryServer.jar"]
ENTRYPOINT ["java", "-jar", "/containerized-SpringCloudConfigurationServer.jar"]
ENTRYPOINT ["java", "-jar", "/containerized-ZuulGatewayServer.jar"]
ENTRYPOINT ["java", "-jar", "/containerized-Customers.jar"]
EXPOSE 2222