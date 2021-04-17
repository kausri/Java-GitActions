FROM java:8
WORKDIR /
COPY /home/runner/work/Java-GitActions/Java-GitActions/targetJava-GitActions-0.0.1-SNAPSHOT-sources.jar ./Java-GitActions-0.0.1-SNAPSHOT-sources.jar
EXPOSE 8080
CMD java - jar Java-GitActions-0.0.1-SNAPSHOT-sources.jar
