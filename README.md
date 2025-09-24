# Project Summary – CRUD-Kotlin-Gradle-SOLID-Principles
# What is the project?

A system to manage students using Clean Architecture with the MVVM pattern, which is the same architecture used by Android. The 3 main layers:

# 1. Domain

Student: The data model (record + name)
StudentRepository: Interface that defines how to save data
SaveStudentUseCase: Business logic for saving students

# 2. Data

StudentDataRepository: Coordinates where to store the data

# 3 types of storage:

Memory: Fast, but data is lost when the app closes

XML: Structured file on disk (like saving in a folder)

API: Remote database on the internet (like uploading to the cloud)

# 3. Presentation – The interface

StudentView: What the user sees
StudentViewModel: Intermediary between the view and the business logic

Relation to Android

The project uses exactly the same patterns as Android.
Google recommends this architecture because it follows SOLID principles, especially:

Each class has a single responsibility

Layers are separated

Easy to maintain and test

Full Flow

User interacts → StudentView
View communicates → StudentViewModel
ViewModel calls → SaveStudentUseCase
UseCase uses → StudentRepository
Repository decides → save in memory + XML + API
