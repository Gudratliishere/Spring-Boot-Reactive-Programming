# Spring Boot Reactive Programming Project

This repository contains a Java Spring Boot project that utilizes reactive programming concepts. 
It leverages Spring Boot's built-in support for reactive programming and uses Reactive MongoDB 
as the database.

## Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [Configuration](#configuration)
- [Building and Running the Application](#building-and-running-the-application)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)

## Introduction

This project is a Java Spring Boot application that embraces reactive programming, 
which allows for non-blocking and asynchronous handling of requests. It uses Spring WebFlux, 
which is the reactive counterpart of the traditional Spring MVC framework, and Reactive MongoDB 
to provide a reactive data access layer.

## Prerequisites

Before running this project, ensure you have the following prerequisites:

- Java Development Kit (JDK) 11 or higher installed
- Apache Maven build tool
- Reactive MongoDB instance or MongoDB server or Docker

## Getting Started

To get started with the project, follow these steps:

1. Clone the repository:

   ```shell
   git clone https://github.com/Gudratliishere/Spring-Boot-Reactive-Programming.git
   ```

2. Change to the project directory:

   ```shell
   cd Spring-Boot-Reactive-Programming
   ```

3. Configure the application (see the [Configuration](#configuration) section).

4. Build and run the application (see the [Building and Running the Application](#building-and-running-the-application) section).

## Project Structure

The project structure follows the standard Spring Boot application structure, with the main components being:

- `src/main/java`: Contains the Java source code of the application.
- `src/main/resources`: Contains the application configuration files.

Here's an overview of the project structure:

```
.
├── src
│   └── main
│       ├── java
│       │   └── com.example.reactive
│       │       ├── controller                                       # Contains the REST controller classes
│       │       ├── entity                                           # Contains the data model classes
│       │       ├── repository                                       # Contains the reactive MongoDB repositories
│       │       └── SpringBootReactiveProgrammingApplication.java    # The main application class
│       └── resources
│           ├── application.yml           # Application configuration file
│           └── docker-compose.yml        # Docker file for running mongodb instance
└── pom.xml                               # Maven project configuration file
```

## Configuration

The application can be configured using the `application.yml` file located in the 
`src/main/resources` directory. Modify this file to suit your specific environment and requirements.

Some common configuration properties include:

- `server.port`: The port on which the application listens for incoming requests.
- `spring.data.mongodb.uri`: The connection URI for Reactive MongoDB.

Please refer to the Spring Boot documentation for more information on available configuration properties.

## Building and Running the Application

To build and run the application, follow these steps:

1. Open a terminal and navigate to the project directory.
2. Run `docker-compose.yml` file under `src\main\resouces\` directiory

2. Build the application using Maven:

   ```shell
   mvn clean package
   ```

3. Once the build is successful, you can run the application:

   ```shell
   java -jar

target/reactive-application.jar
   ```

   The application will start and be accessible at `http://localhost:8080` (assuming the default configuration).

## API Endpoints

The application exposes RESTful API endpoints for managing resources. Here are some example endpoints:

- `GET /employee`: Retrieves all resources.
- `GET /employee/{id}`: Retrieves a specific resource by ID.
- `POST /employee`: Creates a new resource.

Feel free to customize and expand the API endpoints based on your application's requirements. 
Refer to the provided controller classes for implementation details.

```

## Contributing

Contributions to this project are welcome. If you have any suggestions, improvements, or bug fixes, 
please create a pull request or open an issue.