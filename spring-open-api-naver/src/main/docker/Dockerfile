FROM java:8
VOLUME /tmp
ADD docker-spring-mysql.jar docker-spring-mysql.jar
RUN bash -c 'touch /docker-spring-mysql.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/docker-spring-mysql.jar"]