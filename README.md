# Triangle Project

[![Build Status](https://travis-ci.org/irimia-dragos/triangleProject.png)](https://travis-ci.org/irimia-dragos/triangleProject)

This is a sample project.

Do not use in production.



# Building

This project is build by maven.

You must have maven installed in order to build this project.
```
mvn clean install
```
The generate jar will be available in the target folder

In order to run the project one could use the follwing command:
```
java -jar triangles/target/triangles-1.0-SNAPSHOT.jar
```

# Microbenchmarking
The project uses JMH to do micro benchmarks on the Triangle project.
This is separated in a different pom file.
To run the test, one could use the following command:
```
java -jar jhm/target/benchmarks.jar
```

# Configuration
The application will get 3 parameters from the command line.
These parameters must be positive integers.

If the application will receive any other type, it will output an appropriate error.
 
If the parameters will pass the validation, the application will output the triangle type.

# More info
There is also a short description in the project [wiki page](https://github.com/irimia-dragos/triangleProject/wiki)