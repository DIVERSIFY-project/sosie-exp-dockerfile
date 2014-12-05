FROM simonallier/sosie-exp
MAINTAINER simon.allier@gmail.com

RUN sudo apt-get update && sudo apt-get install -y libswt-gtk-3-java lib32z1 lib32ncurses5 lib32stdc++6 qemu-kvm

# Main Android SDK
RUN wget -qO- "http://dl.google.com/android/android-sdk_r23.0.2-linux.tgz" | tar -zxv -C /home/user/

# Other tools and resources of Android SDK
ENV ANDROID_HOME /home/user/android-sdk-linux
RUN echo "export ANDROID_HOME=$ANDROID_HOME" >> /home/user/.bashrc
ENV PATH ${PATH}:${ANDROID_HOME}/tools:${ANDROID_HOME}/platform-tools
RUN echo "export PATH=$PATH" >> /home/user/.bashrc
RUN echo y | android update sdk --all --filter platform-tools,build-tools-20.0.0,android-17,sysimg-17,system-image,extra-android-support --no-ui --force 
RUN echo y | android update sdk --all --filter sys-img-x86-android-17 --no-ui --force && \
echo no | android create avd -n myandroid -t android-17 -b x86
