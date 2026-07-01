# Design Patterns in Java – Singleton & Factory Method

## Overview

This repository contains Java implementations of two fundamental **Creational Design Patterns** from the Gang of Four (GoF) Design Patterns:

- Singleton Pattern
- Factory Method Pattern

These projects demonstrate how design patterns can improve code reusability, maintainability, scalability, and object creation mechanisms in real-world software development.

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

## Project Structure

### Singleton Pattern

```
SingletonPatternExample
│
├── Logger.java
└── SingletonTest.java
```

### Factory Method Pattern

```
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

---

## Design Patterns Used

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

## Learning Outcomes

After completing these implementations, you will understand:

- Creational Design Patterns
- Object-Oriented Design Principles
- Encapsulation
- Abstraction
- Loose Coupling
- Code Reusability
- Maintainable Software Design

---

## Technologies

- Java
- JDK 8+
- IntelliJ IDEA / Eclipse / VS Code

---

## How to Run

1. Clone the repository

```bash
git clone https://github.com/your-username/Design-Patterns-Java.git
```

2. Open the project in your preferred Java IDE.

3. Compile and run:

- `SingletonTest.java`
- `FactoryTest.java`

---

## Repository Purpose

This repository was developed as part of a Java Design Patterns exercise to demonstrate the practical implementation of commonly used creational design patterns. The implementations are simple, modular, and suitable for learning the core concepts of software design patterns.

---

## Author

**Bhumistha Sahoo**



---

## License

This project is intended for educational and learning purposes.
