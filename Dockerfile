FROM gtbanf1979/maven:v1
USER 0
WORKDIR /usr/src/app
RUN apt-get install -y curl
COPY target/server.jar /usr/src/app





CMD ["java","-jar","/usr/src/app/server.jar"]
