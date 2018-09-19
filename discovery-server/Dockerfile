FROM openjdk:10-slim
VOLUME /tmp
EXPOSE 8761
ARG JAR_FILE
ARG CONFIG_URI
ENV CONFIG_URI_ENV=${CONFIG_URI}
COPY ${JAR_FILE} app.jar
RUN echo $JAR_FILE
RUN echo $CONFIG_URI_ENV
CMD sleep 10
ENTRYPOINT java -DCONFIG_URI=${CONFIG_URI_ENV} -Djava.security.egd=file:/dev/./urandom -jar --add-modules java.xml.bind /app.jar

