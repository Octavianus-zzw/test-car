FROM java:8
ADD target/*.jar /test-car-master.jar
CMD java -jar -Dapollo.configService=http://apollo-service-pro-apollo-configservice.apollo:8080 -Denv=PRO -Dapollo.cluster=pro /test-car-master.jar