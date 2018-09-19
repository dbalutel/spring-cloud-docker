FROM openjdk:10-slim
RUN apt-get update && apt-get install -y --no-install-recommends \
		git
ARG RABBIT_URI
ENV RABBIT_URI_ENV=${RABBIT_URI}
VOLUME /tmp
EXPOSE 8888
ARG CONFIG_REPO
ENV CONFIG_REPO_ENV=${CONFIG_REPO}
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
RUN echo ${CONFIG_REPO}
RUN mkdir config-repo
COPY config-repo /config-repo
RUN ls config-repo
ENTRYPOINT java -DCONFIG_REPO=${CONFIG_REPO_ENV} -DRABBIT_URI=${RABBIT_URI_ENV} -Djava.security.egd=file:/dev/./urandom -jar /app.jar
