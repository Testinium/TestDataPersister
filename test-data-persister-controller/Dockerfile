FROM java:8-jre
MAINTAINER Onur Erdogan <onur.erdogan@sahabt.com>

ADD ./target/test-data-persister-controller.jar /app/
ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-Xmx256m", "-jar", "/app/test-data-persister-controller.jar"]

#Remote DEBUG on 8000
#ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=8000", "-Xms16m", "-Xmx256m", "-XX:MaxMetaspaceSize=128m", "-XX:CompressedClassSpaceSize=16m", "-Xss512k", "-Xmn32m", "-XX:InitialCodeCacheSize=16m", "-XX:ReservedCodeCacheSize=32m", "-XX:MaxDirectMemorySize=64m", "-jar", "/app/AccountApp.jar"]

EXPOSE 8080
