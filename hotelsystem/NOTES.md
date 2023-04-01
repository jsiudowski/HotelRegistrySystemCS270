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

### _Editing the classes_
Using Java Persistent API, the various objects will be edited.  
I'm going through each of the classes and labeling them as @Entity's.  
Then I'm going to add @Id and @GeneratedValue using JPA.  
@Entity denotes this class for storage in a relational table.  
@Id and @GeneratedValue identify the primary key and auto generate the value.  

**Note: Any class with an ID is being edited to conform to this. All Ids will be int**  

To-Do:  
Floor, Hotel, Payment, Reservation, Room  
Read JPA annotation for foreign keys and data relations  
Need a login model to bind usernames and passwords to persons  

### _Day 2_
Adding annotations to the classes is going to take some experimentation. I might start small and expand from there
rather than try doing it all at once. @MappedSuperclass defines a class as not needing its own table  

More research needs to be done on the Repository pattern.

Considering whether Employee should have an "isAdmin" variable.  

### _Repository_
I'm starting out by just creating an interface for the employee.java file. I want to start out small and expand from there.
Using the interfaces within the repository we can communicate with the mySQL database.  
Following the tutorial, we're going to add some configurations to the application.properties file.  

**Note: the tutorial asks that "spring.jpa.hibernate.ddl-auto=update" is added to the properties file. For the time being, this means that dummy data will need to be manually deleted.**    

Spring.io recommends using Long variable types for IDs, I'm leaving it as int for the time being.  

### _Database_
I've downloaded mySQL and created a database. We just have to see if it will connect nicely now.  
To access the db, username=root. Password is in the discord, or the application properties file.  
***The application.properties file will be added to the .gitignore file***
