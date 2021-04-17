FROM java:8
WORKDIR /home/runner/work/Java-GitActions/Java-GitActions/target
COPY Java-GitActions-0.0.1-SNAPSHOT-sources.jar Java-GitActions-0.0.1-SNAPSHOT-sources.jar
EXPOSE 8080
CMD java - jar Java-GitActions-0.0.1-SNAPSHOT-sources.jar
