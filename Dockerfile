FROM eu.gcr.io/storytel-build/runtime-java:17
WORKDIR /app
COPY ./build/docker/main/layers ./
EXPOSE 8080
CMD exec java -Dcom.sun.management.jmxremote ${JAVA_OPTS} -jar application.jar
