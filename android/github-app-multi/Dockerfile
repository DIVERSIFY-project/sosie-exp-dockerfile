FROM simonallier/sosie-exp-android

MAINTAINER simon.allier@gmail.com

WORKDIR /root/sosies-generator
COPY exp.properties /root/sosies-generator/exp.properties
RUN mkdir sosie
COPY github_good.json /root/sosies-generator/sosie/github_good.json

WORKDIR /root/android
COPY pom.xml /root/android/pom.xml
ADD HomeActivityTest /root/android/HomeActivityTest


