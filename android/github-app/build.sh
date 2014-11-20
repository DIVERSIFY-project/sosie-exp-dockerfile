#!/bin/sh
rm integration-tests/src/main/java/com/github/mobile/tests/issue/EditIssueActivityTest.java
mvn test
mvn clean android:emulator-start -Dandroid.emulator.avd=myandroid -Dandroid.emulator.options="-no-window -no-audio -wipe-data" -Dandroid.emulator.wait=100000 install
mvn android:emulator-stop-all
mvn clean android:emulator-start -Dandroid.emulator.avd=myandroid -Dandroid.emulator.options="-no-window -no-audio -wipe-data" -Dandroid.emulator.wait=100000 install
mvn android:emulator-stop-all