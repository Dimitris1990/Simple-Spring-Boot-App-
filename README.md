# Simple Spring-Boot App for Repath Interview

This is a basic maven Spring Boot rest application made using Java 8.

Program structure->
Technologies used:
MySql database, Java version 8, Spring Boot, Hibernate/Jpa.

First download the Files.

Database Setup->
1: Run the sql script in Workbench for the Database to be saved in your system.
2: Go to the application.properties file in the Other Sources file and set your localhost port, your database username and password to establish a connection between the database and the back end.

To Run the program->
1- Open your terminal and type: cd "the location the project is stored" (for example  "C:\Users\User\Documents\Projects\InterviewApp").
2- Type: mvn install. An executable .jar file will be created inside the target folder.
3- Type: dir target
4- Copy the .jar file and type: java -jar target/InterviewApp-0.0.1-SNAPSHOT.jar and hit enter. Now you'll be able to send http requests.
5- Use a web application like Rested, Postman etc to send your requests to the program.!
[Screenshot 2021-04-01 172331](https://user-images.githubusercontent.com/67753052/113308613-043f9380-930f-11eb-918d-8750f3e558c5.png)

Documentation->

Database-> Only one table was created with 4 fields (id,name,email,company)

Back End-> 

    Dependencies: Spring Boot DevTools (provides fast application restarts, LiveReload, and configurations for enhanced development experience) , 
                  Spring Data JPA (persist data in SQL stores with Java Persistence API using Spring Data and Hibernate), 
                  Spring Web (build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container),
                  MySQL Driver (MySQL JDBC and R2DBC driver).
                  
    Controller: One controller was needed to to manage all the required requests.
                Endpoint 1: Get request for all the Users.
                Endpoint 2: Post request to add a new user.
                Endpoint 3: Put request to update an existing user by ID.
                Endpoint 4: Delete request for deleting an existing user by ID.
                Endpoint 5: Get all users that belong to the same company.
