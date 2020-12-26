From openjdk:8
EXPOSE 8181
ADD target/jenkens.jar jenkens.jar
ENTRYPOINT ["java","-jar","/jenkens.jar"]