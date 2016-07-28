FROM java:7
COPY . /usr/src/docker
WORKDIR /usr/src/docker
RUN javac src/docker/DockerTest.java
CMD ["java","src/docker/DockerTest"]
