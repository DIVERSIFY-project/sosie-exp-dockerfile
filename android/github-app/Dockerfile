FROM simonallier/sosie-exp-android-base
MAINTAINER simon.allier@gmail.com

RUN echo y | android update sdk --all --filter android-16 --no-ui --force

WORKDIR /home/user
RUN git clone https://github.com/github/android.git

WORKDIR /home/user/android
COPY pom.xml /home/user/android/pom.xml
COPY build.sh /home/user/android/build.sh
RUN sh build.sh

WORKDIR /home/user/sosies-generator
COPY exp.properties /home/user/sosies-generator/exp.properties
COPY run.sh /home/user/sosies-generator/run.sh
COPY dependencyPom.xml /home/user/android/dependencyPom.xml
