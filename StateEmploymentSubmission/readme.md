This project contains a Spring boot application, wrapped in Docker, that demonstrates a connection to H2 database
Scripts to build an SQL compliant database that has tables, views, and at least one stored procedure/function (preferably using Flyway)


**Requirements**

The following software must be installed on the machine on which this project is to be run.

- Maven (latest version)
- Java SDK Version 17 or better
- docker (or docker desktop)

**Running the project**

To run this project, execute the following commands in the project root directory.

```
mvn clean install

docker build -t myorg/myapp .  

docker run -p 8080:8080 myorg/myapp
```
This application uses a Dockerfile to create its container.  An alternate method, not used in this project, would be to use a compose.yml file.
You can see the output of the flyway migration files V005__callFunction.sql and V007__executeViewAndFunction.sql in the applications output.

**Test the REST Service**

Once started, you may execute the exposed REST service by entering the following URL in the address bar of your browser...
```
localhost:8080/users
```
This will return a JSON array with 2 user records in it. These records were created via flyway migration.
The endpoint is a standard spring controller which calls a repository class in order to retrieve a list of entity instances.

**AWS Scripts**

The requested AWS CLI scripts can be found in this project, in the AWSScripts directory.

