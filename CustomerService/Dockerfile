FROM openjdk
MAINTAINER Angel <maraujo0389@gmail.com>
ADD /target/Customers-1.0-SNAPSHOT.jar containerized-customers.jar
ENTRYPOINT ["java", "-jar", "/containerized-customers.jar"]
EXPOSE 87