# COGNIZANT MANDATORY HANDS-ON ASSESSMENT

## Overview

This repository contains Java implementations of fundamental **Design Patterns** and **Algorithms** commonly used in software development. The projects demonstrate object-oriented programming concepts, efficient searching techniques, recursion, and software design principles through practical, real-world scenarios.

The repository currently includes the following implementations:

### Java Exercises

- Singleton Pattern
- Factory Method Pattern
- E-commerce Platform Search (Linear Search & Binary Search)
- Financial Forecasting using Recursion

### Oracle SQL & PL/SQL Exercises

- Control Structures
- Stored Procedures

---

## Projects Included

### 1. Singleton Pattern

**Project Name:** `SingletonPatternExample`

#### Objective
Implement the Singleton Design Pattern to ensure that only one instance of a logging utility exists throughout the application's lifecycle.

#### Scenario
A logging utility is commonly shared across an application. Creating multiple logger objects may lead to inconsistent logging behavior and unnecessary memory usage. The Singleton Pattern guarantees that only one logger instance is created and shared globally.

#### Features
- Private constructor to prevent direct object creation
- Static instance of the Logger class
- Global access through the `getInstance()` method
- Verification that only one object is created

#### Technologies Used
- Java
- Object-Oriented Programming (OOP)

#### Expected Output

```text
Logger Instance Created
LOG : Application Started
LOG : Loading Files
LOG : Application Closed

366712642
366712642
366712642

Only One Logger Instance Exists
```

---

### 2. Factory Method Pattern

**Project Name:** `FactoryMethodPatternExample`

#### Objective
Implement the Factory Method Design Pattern to create different document types without exposing the object creation logic to the client.

#### Scenario
A document management system needs to create multiple document types such as Word, PDF, and Excel. Instead of directly instantiating these objects, dedicated factory classes are responsible for creating the appropriate document.

#### Features
- Common Document interface
- Concrete document implementations
- Abstract factory class
- Separate factory classes for each document type
- Loose coupling between client and object creation

#### Technologies Used
- Java
- Object-Oriented Programming (OOP)

#### Expected Output

```text
Opening Word Document
Opening PDF Document
Opening Excel Document
```

---

### 3. E-commerce Platform Search Function

**Project Name:** `EcommerceSearchExample`

#### Objective
Implement and compare Linear Search and Binary Search algorithms for searching products efficiently in an e-commerce platform.

#### Scenario
Products are stored in an array and searched using their Product ID. Linear Search is performed on an unsorted array, while Binary Search is performed after sorting the products by Product ID.

#### Features
- Product class with searchable attributes
- Linear Search implementation
- Binary Search implementation
- Time complexity comparison
- Performance analysis using Big O notation

#### Technologies Used
- Java
- Arrays
- Searching Algorithms

#### Expected Output

```text
Linear Search
103 Phone Electronics

Binary Search
103 Phone Electronics
```

---

### 4. Financial Forecasting using Recursion

**Project Name:** `FinancialForecasting`

#### Objective
Develop a financial forecasting tool that predicts future investment values using a recursive approach.

#### Scenario
The application estimates future values based on an initial investment amount, annual growth rate, and the number of years. The project demonstrates recursion and discusses optimization techniques for recursive algorithms.

#### Features
- Recursive financial forecasting
- Future value prediction
- Time complexity analysis
- Space complexity analysis
- Recursive optimization techniques

#### Technologies Used
- Java
- Recursion
- Mathematical Computation

#### Expected Output

```text
Future Value after 5 years = 16105.10
```

---

## Project Structure

### Singleton Pattern

```text
SingletonPatternExample
│
├── Logger.java
└── SingletonTest.java
```

### Factory Method Pattern

```text
FactoryMethodPatternExample
│
├── Document.java
├── WordDocument.java
├── PdfDocument.java
├── ExcelDocument.java
├── DocumentFactory.java
├── WordFactory.java
├── PdfFactory.java
├── ExcelFactory.java
└── FactoryTest.java
```

### E-commerce Platform Search

```text
EcommerceSearchExample
│
├── Product.java
├── LinearSearch.java
├── BinarySearch.java
└── SearchTest.java
```

### Financial Forecasting

```text
FinancialForecasting
│
├── FinancialForecast.java
└── ForecastTest.java
```

### Documentation

```text
COGNIZANT WEEK-1.docx
WEEK2 COGNIZANT.docx
WEEK3 COGNIZANT.docx
```

---

## Concepts Covered

### Singleton Pattern

Ensures that a class has only one instance while providing a global point of access to that instance.

**Applications**
- Logging Systems
- Configuration Managers
- Database Connections
- Cache Management

---

### Factory Method Pattern

Defines an interface for creating objects while allowing subclasses to determine which concrete class to instantiate.

**Applications**
- Document Management Systems
- Payment Gateways
- Notification Services
- Cross-platform UI Components

---

### Linear Search

Searches elements sequentially until the required element is found.

**Time Complexity**

- Best Case: **O(1)**
- Average Case: **O(n)**
- Worst Case: **O(n)**

**Applications**
- Small datasets
- Unsorted collections
- Simple lookup operations

---

### Binary Search

Searches efficiently by repeatedly dividing a sorted array into halves.

**Time Complexity**

- Best Case: **O(1)**
- Average Case: **O(log n)**
- Worst Case: **O(log n)**

**Applications**
- Large sorted datasets
- Search engines
- E-commerce product catalogs
- Database indexing

---

### Recursion

A programming technique where a method calls itself to solve smaller instances of the same problem.

**Applications**
- Financial Forecasting
- Tree Traversal
- Divide and Conquer Algorithms
- Dynamic Programming

---

---

## Oracle SQL & PL/SQL Exercises

### Control Structures

The PL/SQL Control Structures exercise demonstrates the implementation of decision-making and iterative programming constructs in Oracle SQL*Plus using practical banking scenarios.

#### Scenarios Implemented

- Apply a **1% interest rate concession** for senior citizen customers.
- Promote eligible customers to **VIP status** based on account balance.
- Generate reminder messages for customers whose loan due dates fall within the next **30 days**.

#### Concepts Covered

- Anonymous PL/SQL Blocks
- FOR Loops
- IF-THEN Statements
- UPDATE Statements
- Transaction Control
- DBMS_OUTPUT
- JOIN Operations

#### Technologies Used

- Oracle SQL
- Oracle PL/SQL
- SQL*Plus

---

### Stored Procedures

The Stored Procedures exercise demonstrates reusable PL/SQL procedures for automating common banking operations.

#### Scenarios Implemented

- Process monthly interest for all savings accounts.
- Update employee salaries based on department bonus percentage.
- Transfer funds securely between customer accounts after validating account balance.

#### Concepts Covered

- Stored Procedures
- Parameters
- SELECT INTO
- Conditional Statements
- Transaction Management
- COMMIT
- DBMS_OUTPUT

#### Technologies Used

- Oracle SQL
- Oracle PL/SQL
- SQL*Plus

---

### Documentation

The complete SQL and PL/SQL implementations, explanations, sample data, and outputs are available in:

- **COGNIZANT WEEK-1.docx**
- **WEEK2 COGNIZANT.docx**
- **WEEK3 COGNIZANT.docx**

## Learning Outcomes

After completing these implementations, you will understand:

- Creational Design Patterns
- Searching Algorithms
- Recursive Programming
- Big O Notation
- Time Complexity Analysis
- Object-Oriented Programming
- Encapsulation
- Abstraction
- Polymorphism
- Loose Coupling
- Software Design Principles
- Code Reusability
- SQL Programming
- Oracle PL/SQL
- Anonymous PL/SQL Blocks
- Stored Procedures
- Transaction Management
- Database Programming
---

## Technologies

### Programming Languages

- Java
- SQL
- PL/SQL

### Development Tools

- Oracle SQL*Plus
- Oracle Database
- IntelliJ IDEA
- Eclipse
- Visual Studio Code
- Git & GitHub
---

## How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/Java-Design-Patterns-And-Algorithms.git
```

### 2. Navigate to the Repository

```bash
cd Java-Design-Patterns-And-Algorithms
```

### 3. Open the Project

Open the repository in your preferred Java IDE such as:
- IntelliJ IDEA
- Eclipse
- Visual Studio Code

### 4. Compile and Run

Execute the following test classes:

- `SingletonTest.java`
- `FactoryTest.java`
- `SearchTest.java`
- `ForecastTest.java`

---

## Oracle SQL & PL/SQL Programs

The Oracle SQL and PL/SQL implementations are documented in **WEEK3 COGNIZANT.docx**.

### Steps to Execute

1. Open Oracle SQL*Plus.
2. Execute the `CREATE TABLE` statements.
3. Insert the sample data.
4. Run the PL/SQL blocks or stored procedures.
5. Verify the results using the provided `SELECT` statements.
---

## Repository Purpose

This repository was developed as part of the **Cognizant Mandatory Hands-on Assessment** to demonstrate practical implementations of Java Design Patterns, Algorithms, Oracle SQL, and Oracle PL/SQL concepts. The projects focus on solving real-world software engineering and banking scenarios while emphasizing clean coding practices, algorithm analysis, object-oriented programming, and database programming.

---

## Future Improvements

- Add additional GoF Design Patterns
- Implement Sorting Algorithms
- Include Dynamic Programming examples
- Add Unit Testing using JUnit
- Improve project modularity using packages
- Add UML Class Diagrams for each exercise
- Add more Oracle SQL exercises
- Implement PL/SQL Functions
- Implement Database Triggers
- Add Cursor-based Programs
- Implement Packages and Exception Handling
---

## Author

**Bhumistha Sahoo**
---

## License

This project is intended for educational and learning purposes.

