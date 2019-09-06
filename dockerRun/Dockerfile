FROM maraujo0389/customer-service-img:v2
MAINTAINER Angel <maraujo0389@gmail.com>
ENTRYPOINT ["java", "-jar", "/root/customer-service/SpringCloudConfigurationServer-1.0-SNAPSHOT.jar","java", "-jar", "/root/customer-service/EurekaDiscoveryServer-1.0-SNAPSHOT.jar","java", "-jar", "/root/customer-service/ZuulGatewayServer-1.0-SNAPSHOT.jar"]
EXPOSE 8761 8888 8080 8091 27017 8761
#ENTRYPOINT ["java", "-jar", "/root/customer-service/SpringCloudConfigurationServer-1.0-SNAPSHOT.jar"]
#ENTRYPOINT ["java", "-jar", "/root/customer-service/EurekaDiscoveryServer-1.0-SNAPSHOT.jar"]
#ENTRYPOINT ["java", "-jar", "/root/customer-service/ZuulGatewayServer-1.0-SNAPSHOT.jar"]
#CMD ["java", "-jar", "/root/customer-service/SpringCloudConfigurationServer-1.0-SNAPSHOT.jar"]
#CMD ["java", "-jar", "/root/customer-service/EurekaDiscoveryServer-1.0-SNAPSHOT.jar"]
#CMD ["java", "-jar", "/root/customer-service/ZuulGatewayServer-1.0-SNAPSHOT.jar"]
#CMD ["mvn spring-boot:run", "/root/customer-service/CustomerService"]
#EXPOSE 8761 8888 8080 8091 27017 8761
