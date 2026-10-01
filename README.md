# Student Management CRUD

A RESTful Student Management application developed using Spring Boot, Spring Data JPA, and MySQL. This project demonstrates basic CRUD operations following a layered architecture.

## 📌 Project Overview

The application allows users to manage student information through REST APIs.

It supports creating, retrieving, updating, and deleting student records.

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- REST API
- Postman
- Git & GitHub

## ✨ Features

- Add a new student
- Get all students
- Get student by ID
- Update student details
- Delete student
- MySQL database integration
- RESTful API architecture
- Layered architecture using Controller, Service, Repository, and Model

## 🏗️ Project Structure

```text
StudentManagement_CRUD
│
├── src
│   └── main
│       ├── java
│       │   └── com.Student.StudentManagement
│       │       ├── Controller
│       │       ├── Service
│       │       ├── Repository
│       │       ├── Model
│       │       └── StudentManagementApplication
│       │
│       └── resources
│           └── application.properties
│
├── .gitignore
├── pom.xml
├── mvnw
└── mvnw.cmd
