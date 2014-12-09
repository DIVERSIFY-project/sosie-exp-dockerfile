FROM simonallier/sosie-exp
MAINTAINER simon.allier@gmail.com

RUN sudo apt-get update && sudo apt-get install -y libswt-gtk-3-java lib32z1 lib32ncurses5 lib32stdc++6 qemu-kvm

# Main Android SDK
RUN wget -qO- "http://dl.google.com/android/android-sdk_r24-linux.tgz" | tar -zxv -C /home/user/

# Other tools and resources of Android SDK
ENV ANDROID_HOME /home/user/android-sdk-linux
RUN echo "export ANDROID_HOME=$ANDROID_HOME" >> /home/user/.bashrc
ENV PATH ${PATH}:${ANDROID_HOME}/tools:${ANDROID_HOME}/platform-tools
RUN echo "export PATH=$PATH" >> /home/user/.bashrc
RUN echo y | android update sdk --all --filter platform-tools,build-tools-21.1.1,android-21,sys-img-x86_64-android-21 --no-ui --force 
RUN echo no | android create avd -n myandroid -t android-21 -b x86_64
