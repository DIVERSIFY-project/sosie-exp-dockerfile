#!/bin/sh
cpu=$(cat nbProcess)
for i in `seq 1 1000`
do
    java -Djava.library.path=lib -Xmx2000m -jar target/Sosies-generator-1.0-SNAPSHOT-jar-with-dependencies.jar exp.properties
done
