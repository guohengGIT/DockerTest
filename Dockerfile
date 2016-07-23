FROM java:7
COPY . /usr/src/docker
WORKDIR /usr/src/docker
RUN javac DockerTest.java
CMD ["java","DockerTest"]
