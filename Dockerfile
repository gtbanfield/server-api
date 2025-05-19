FROM 192.168.1.83:5000/repository/harness/maven:v1
USER 0
WORKDIR /usr/src/app
RUN apt-get install -y curl
COPY target/server.jar /usr/src/app





CMD ["java","-jar","/usr/src/app/server.jar"]
