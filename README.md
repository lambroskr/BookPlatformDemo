# BookPlatformDemo

**BookPlatformDemo** is a Spring Boot-based web application that allows users to register and access book-related data through REST APIs. It also features role-based access control with `admin` and `user` roles. Data is persisted in a PostgreSQL database, and passwords are securely stored using bcrypt encryption.

## Features

- **User Registration**: Users can register and have their credentials stored securely with bcrypt encryption.
- **Role-based Access Control**: Admins and regular users have different access levels to perform actions.
- **Book API**:
  - Retrieve all books
  - Get details of a book by its ID
  - Search for books by title or author
- **Spring Security Integration**: Secure the application with login and access control based on user roles
- **Data Persistence**: Uses Spring Data JPA with PostgreSQL to store users and books

## Technologies Used

- **Spring Boot**: Core framework for the application
- **Spring Data JPA**: ORM tool for interacting with the PostgreSQL database
- **Spring Security**: Provides security features like authentication and role-based authorization
- **Lombok**: Reduces boilerplate code for entity classes
- **Spring Web**: For building the RESTful API
- **PostgreSQL**: Database for persisting users and book information

## API Endpoints

### Books

- **Get all books**:
  ```
  GET /books
  ```
  Returns a list of all books.

- **Get book by ID**:
  ```
  GET /book/id/{id}
  ```
  Retrieves a specific book by its ID.

- **Get book by title**:
  ```
  GET /book/title/{title}
  ```
  Finds a book based on the title.

- **Get books by author**:
  ```
  GET /book/author/{author}
  ```
  Returns a list of books written by the specified author.

### User Registration

- **Register a new user**:
  ```
  POST /register
  ```
  Registers a new user in the system. The password will be encrypted before saving to the database.

  **Example request body**:
  ```json
  {
      "username": "user1",
      "email": "user1@example.com",
      "password": "password"
  }
  ```

## Role-Based Access Control

- **Admin**: Has access to administrative endpoints
- **User**: Has restricted access to regular user actions

The application utilizes Spring Security to authenticate and authorize users based on their roles. Only authenticated users can access certain endpoints, and permissions differ between admins and regular users.

## Security Features

- Passwords are encrypted using bcrypt for secure storage in the PostgreSQL database
- Role-based access ensures different levels of control for `admin` and `user`

## Database Setup

The application uses PostgreSQL as its database. Make sure you have PostgreSQL running and configured with the correct credentials in `application.properties`.

### Example `application.properties` configuration:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/book_platform
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.datasource.driver-class-name=org.postgresql.Driver
```

## Getting Started

### Prerequisites

- Java 17+
- PostgreSQL
- Maven

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/BookPlatformDemo.git
   ```

2. Configure PostgreSQL in `application.properties`

3. Build and run the application using Maven:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. Access the APIs at `http://localhost:8080`
