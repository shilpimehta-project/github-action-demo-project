FROM openjdk:17
EXPOSE 8080
ADD target/springboot-githubactions-demo.jar springboot-githubactions-demo.jar
ENTRYPOINT["java","-jar","/springboot-images-new.jar"]