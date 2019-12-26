# ProductApi
Spring Boot Get and Update  Product Rest API Example
Tutorial: Get  an Update Product with Spring Boot

Steps to Setup

1. Clone the repository

git clone https://github.com/rahul13117/productApi.git
2. Specify the file uploads directory

Open src/main/resources/application.properties file and change the property for Redis Host 


2. Run the app using maven

cd spring-boot-file-myretail-api
mvn spring-boot:run
That's it! The application can be accessed at http://localhost:8080.

You may also package the application in the form of a jar and then run the jar file like so -

mvn clean package
java -jar target/productApi.jar



 REST APIs Endpoints

  1 .  Retrive  Product By id 
  
  Get :   
         http://localhost:8090/v1/products/13860428 
         Accept: application/json
         Content-Type: application/json

  
  
    {  
    "id": "13860428", 
    "name": "The Big Lebowski (Blu-ray)",
    "current_price": {
        "value": 22000.45,
         "currencyCode": "USD"
         }
     }


  2. Update Product Price into DataStore

  PUT :  /v1/updateProduct/{id}
  
  Accept: application/json
  
  Content-Type: application/json

    {
    "id": "13860428",
    "name": "The Big Lebowski (Blu-ray)",
    "current_price": {
        "value": 22000.45,
         "currencyCode": "USD"
         }
    }


To view Swagger 2 API docs

http://localhost:8090/swagger-ui.html#/Product-api

