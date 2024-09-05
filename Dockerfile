FROM eclipse-temurin:17-jdk-alpine
RUN apk add curl
VOLUME /tmp
EXPOSE 8080
ADD target/ws-codepipeline-deploy.jar ws-codepipeline-deploy.jar
ENTRYPOINT ["java","-jar","/ws-codepipeline-deploy.jar"]

