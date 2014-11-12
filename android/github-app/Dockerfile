FROM sosie-exp-docker/android
MAINTAINER simon.allier@gmail.com


WORKDIR /home/user
RUN git clone https://github.com/github/android.git

WORKDIR /home/user/android
RUN echo y | android update sdk --all --filter android-16 --no-ui --force 

COPY pom.xml  /home/user/android/pom.xml

RUN mvn install
RUN mvn android:emulator-start -Dandroid.emulator.avd=myandroid -Dandroid.emulator.options="-no-window -no-audio" -Dandroid.emulator.wait=100000 install