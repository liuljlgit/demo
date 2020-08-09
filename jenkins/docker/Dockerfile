FROM java:8
MAINTAINER lijun
ADD jenkins-0.0.1-SNAPSHOT.jar jenkins.jar
EXPOSE 20010
ENTRYPOINT ["java","-jar","jenkins.jar","> /log/jenkins.log"]