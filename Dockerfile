FROM hub.c.163.com/library/java:8-alpine
ENV LANG C.UTF-8
VOLUME /app
ADD /pay-center-web/target/pay-center-web-*.jar pay-center.jar
EXPOSE 80
ENTRYPOINT ["java","-jar","pay-center.jar"]