# Task 1 – Spring Boot MVC Application

This project is a simple Spring Boot application created as part of Task 1.
The goal of the project is to present basic usage of Spring MVC controllers,
handling HTTP GET requests and returning both plain text responses and HTML views.

## Technologies
- Java
- Spring Boot
- Spring Web
- Thymeleaf

## Project structure
- `Task1Application` – main class used to start the Spring Boot application
- `GreetingController` – Spring MVC controller handling HTTP requests
- `templates/greeting.html` – Thymeleaf HTML template
- `static/images` – static resources used in the view

## Application startup
The application is started by running the `Task1Application` class.
Spring Boot starts an embedded Tomcat server on port 8080.

## Controller description

### Plain text endpoint
GET `/`

This endpoint returns a simple text response.
The method uses `@ResponseBody`, so the returned String is written directly
to the HTTP response body.

### Greeting endpoint
GET `/greeting`  
GET `/greeting?name=YourName`

This endpoint returns an HTML page rendered using Thymeleaf.
The `name` parameter is optional.  
If it is not provided, the default value `"World"` is used.

The value of the parameter is passed to the view using the `Model` object.

## How to test

1. Start the application.
2. Open a browser and go to:
    - `http://localhost:8080/`
    - `http://localhost:8080/greeting`
    - `http://localhost:8080/greeting?name=YourName`

## Screenshots
Screenshots showing the project structure, application startup and
working endpoints are included in the repository.
