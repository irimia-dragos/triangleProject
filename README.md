# Triangle Project

[![Build Status](https://travis-ci.org/irimia-dragos/triangleProject.png)](https://travis-ci.org/irimia-dragos/triangleProject)

This is a sample project.

Do not use in production.



# Building

This project is build by maven.

You should have maven installed.
```
mvn clean install
```
The generate jar is available in the target folder

In order to run the project one could use the follwing command
```
java -jar target/triangles-1.0-SNAPSHOT.jar
```

# Configuration
The application will get 3 parameters from the command line.
These parameters must be positive integers. 

If the application will receive any other type, it will output an appropriate error.
 
If the parameters will pass the validation, the application will output the triangle type.
