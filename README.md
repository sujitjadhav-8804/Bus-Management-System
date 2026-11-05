# Bus Management System

A RESTful Bus Management System developed using Java and Spring Boot. The application manages bus information and provides API endpoints for performing bus-related operations.

## Technologies Used

- **Programming Language:** Java 21
- **Backend Framework:** Spring Boot
- **ORM:** Hibernate
- **Data Access:** Spring Data JPA
- **Database:** MySQL
- **Build Tool:** Maven
- **API Testing:** Postman

## Features

- Add new bus details
- Retrieve all buses
- Retrieve bus details by ID
- Update existing bus information
- Delete bus records
- Store and manage bus information using MySQL

## Project Structure

```text
BusManagementSystem/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/cdac/busmanagementsystem/
│   │   │       ├── controller/
│   │   │       ├── entity/
│   │   │       ├── enums/
│   │   │       ├── repository/
│   │   │       ├── service/
│   │   │       └── BusManagementSystemApplication.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│
├── pom.xml
└── README.md
```

## Database Configuration

1. Install MySQL and start the MySQL server.
2. Create a database:

```sql
CREATE DATABASE busmanagementdb;
```

3. Configure your database connection in `application.properties`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/busmanagementdb
spring.datasource.username=root
spring.datasource.password=${DB_PASSWORD}
```

Set your MySQL password using a Windows CMD environment variable:

```cmd
set DB_PASSWORD=your_mysql_password
```

## How to Run the Project

**Step 1:** Clone the repository.

```bash
git clone https://github.com/sujitjadhav-8804/Bus-Management-System.git
```

**Step 2:** Navigate to the project directory.

```bash
cd Bus-Management-System
```

**Step 3:** Set your MySQL password in CMD.

```cmd
set DB_PASSWORD=your_mysql_password
```

**Step 4:** Run the Spring Boot application.

```bash
mvnw.cmd spring-boot:run
```

The application runs on:

```text
http://localhost:8080
```

## API Testing

The REST APIs can be tested using Postman.

Base URL:

```text
http://localhost:8080
```

## Author

**Sujit Jadhav**

Computer Engineering Graduate | PGCP-AC @ CDAC Pune

GitHub: [sujitjadhav-8804](https://github.com/sujitjadhav-8804)

---

*This project was developed as a hands-on learning project to understand Java, Spring Boot, REST APIs, Spring Data JPA, Hibernate and MySQL.*
