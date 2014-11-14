FROM simonallier/sosie-exp-android-base
MAINTAINER simon.allier@gmail.com


WORKDIR /home/user
RUN git clone https://github.com/github/android.git

WORKDIR /home/user/android
RUN echo y | android update sdk --all --filter android-16 --no-ui --force 

COPY pom.xml /home/user/android/pom.xml

RUN rm integration-tests/src/main/java/com/github/mobile/tests/issue/EditIssueActivityTest.java
RUN mvn test
RUN mvn clean android:emulator-start -Dandroid.emulator.avd=myandroid -Dandroid.emulator.options="-no-window -no-audio" -Dandroid.emulator.wait=100000 install android:emulator-stop

WORKDIR /home/user/sosies-generator
COPY exp.properties
COPY ../../run.sh
RUN sh run.sh exp.properties