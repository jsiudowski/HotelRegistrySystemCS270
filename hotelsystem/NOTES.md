# Development notes for spring-overhaul branch

### *Spring Initializer*  
30 March 2023  

Began the backend and frontend connection by using the [spring framework](https://start.spring.io/) in order to create an application project package.

Regarding the preferences they were as follows:  
Project: Maven  
Language: Java  
Spring Boot: 3.0.5  
Artifact: hotelsystem

With dependencies:  
Spring Web  
Spring Data JPA  
mySQL Driver  

I then created a proper branch, moved the contents of hotelsystem into the main folder and have since moved the backend objects into /model.

### _Clean up_

Went through all the classes and edited some minute warnings the compiler provided.

**Note: There is one major error in Employee.java on line 16.**  
For the time being, I've commented out the line

### _Finishing folder structure_

Added repository and controller to fit our structure into an actual MVC pattern.  
Now I'm going to go and actually do some more research on Spring framework and MVC patterns.  

