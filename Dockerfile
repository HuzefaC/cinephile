FROM jjosef/11-jdk-slim-docker
CMD echo "All dependencies ready. Starting application..." && java ${JAVA_OPTS} -jar cinephile-all.jar
COPY build/libs/*-all.jar cinephile-all.jar
COPY wait-for wait-for