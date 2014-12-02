FROM simonallier/sosie-exp-android

MAINTAINER simon.allier@gmail.com

WORKDIR /home/user/sosies-generator
COPY exp.properties /home/user/sosies-generator/exp.properties
RUN mkdir sosie
COPY github_good.json /home/user/sosies-generator/sosie/github_good.json

WORKDIR /home/user/android
COPY pom.xml /home/user/android/pom.xml
ADD HomeActivityTest /home/user/android/HomeActivityTest


