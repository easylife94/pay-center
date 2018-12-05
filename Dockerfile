FROM java:8
ENV LANG C.UTF-8
VOLUME /app
COPY /pay-center-web/target/pay-center-web-0.0.1-SNAPSHOT.jar pay-center.jar
RUN bash -c "touch /pay-center.jar"
EXPOSE 8080
ENTRYPOINT ["java","-jar","pay-center.jar"]