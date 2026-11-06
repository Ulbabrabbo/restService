Exercise Spring Boot and Maven

REQUISITE:
- Java 17+

EXECUTION:
- open the terminal on the root of the project.
- run the application with the bash line:    mvn spring-boot:run (with Maven installed)
                                or using:    .\mvnw spring-boot:run (using the integrated wrapper)
(WARNING!: The application will start on port: "8000" (configured in "application.properties" of the project)).

TEST with Bruno:
To test the application with https://docs.usebruno.com/ after the start of the application as described above:
- Create a new collection in Bruno (https://docs.usebruno.com/introduction/quick-start)

- Create a new request for basic greeting:
    Type:   HTTP
    Name:   basic hello
    method: GET
    url:    http://localhost:8000/api/hello

- create a new request for personalized greeting:
    Type:   HTTP
    Name:   personalized hello
    method: GET
    url     http://localhost:8000/api/hello/{name}   (es: http://localhost:8000/api/hello/Davide)
  
Created a request you can run it by clicking the "Send" button.
Or you can RUN all the request togheter by right-clicking the collection and selecting Run, personalizing the runner and the calls for the various requests.

Expected results should be:
basic hello ->         {
                          "message": "Ciao Mondo!"
                       }

personalized hello ->  {
                          "message": "Ciao {Name}!"
                       }  


