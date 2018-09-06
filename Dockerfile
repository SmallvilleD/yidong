FROM 100.125.0.18:20202/servicestage/dockerhub-java:8-jre-alpine

WORKDIR /home/apps/
ADD target/yidong-0.0.1-SNAPSHOT.jar .
ADD target/lib ./lib
ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]