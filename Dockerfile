FROM java:8
WORKDIR /
ADD Java-GitActions.jar Java-GitActions.jar
EXPOSE 8080
CMD java - jar Java-GitActions.jar
