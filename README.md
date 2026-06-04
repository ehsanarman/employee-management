# Employee Management System

A REST API project built using Spring Boot and MySQL for managing employee records.

## Features

- Add Employee
- Get All Employees
- Get Employee By ID
- Update Employee
- Delete Employee
- Search Employee By Name
- Sort Employees
- Pagination Support
- Department-wise Employee Filter
- Swagger API Documentation

## Technologies Used

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Swagger / OpenAPI

## API Endpoints

### Employee APIs

| Method | Endpoint |
|----------|----------|
| POST | /employees |
| GET | /employees |
| GET | /employees/{id} |
| PUT | /employees/{id} |
| DELETE | /employees/{id} |
| GET | /employees/search/{name} |
| GET | /employees/sort |
| GET | /employees/page |
| GET | /employees/department/{department} |

## Swagger Documentation

After running the application:

```
http://localhost:8080/swagger-ui/index.html
```

## Database Configuration

Update the following properties in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employeedb
spring.datasource.username=root
spring.datasource.password=your_password
```

## Run the Project

```bash
mvn spring-boot:run
```

## Author

Ehsan Iqbal

GitHub:
https://github.com/ehsanarman
