Task 2 – Spring Boot REST API

This application was created within the scope of Task 2.
It represents a REST API developed using Spring Boot and provides basic CRUD functionality for managing products.

Technologies used

Java

Spring Boot

Spring Web

Spring Data JPA

H2 In-Memory Database

Swagger / OpenAPI

Running the application

The project is started by executing the Task2Application class.
Once launched, Spring Boot automatically starts an embedded server listening on port 8080.

Swagger UI

Swagger UI is included to document the API and allow interactive testing of all available endpoints.

The Swagger interface can be accessed at:
http://localhost:8080/swagger-ui/index.html

Available API endpoints

The application exposes the following REST endpoints:

POST /api/v1/products – add a new product

GET /api/v1/products – fetch all products

GET /api/v1/products/{id} – fetch a product by its ID

PUT /api/v1/products/{id} – modify an existing product

DELETE /api/v1/products/{id} – delete a product by its ID

Error handling

If a product with the given ID does not exist, the API returns an HTTP 404 Not Found response with an appropriate error message.

Database

An H2 in-memory database is used and is automatically configured during application startup.

The H2 console is available at:
http://localhost:8080/console

Database settings

JDBC URL: jdbc:h2:mem:testdb

Screenshots

The repository includes screenshots that demonstrate:

the project directory structure

successful application startup

working with Swagger UI

execution of CRUD operations

data visible in the H2 database console