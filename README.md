💳 UPI Banking System (Java + JDBC)
📌 Project Overview

This project is a simple UPI Banking System developed using Java and JDBC. It allows users to perform basic banking operations such as:

💸 Withdraw money
🔁 Transfer (Deposit) money between accounts

The system follows a layered architecture:
Controller Layer
Service Layer
DAO (Data Access Object) Layer
Database Connection Layer

🏗️ Project Structure
UPI_system/
│
├── Controller.java      // Handles user requests
├── service.java         // Business logic layer
├── dao.java             // Database operations
├── dbcon.java           // Database connection setup
├── userApplication.java // Main class (entry point)


⚙️ Technologies Used
☕ Java
🗄️ JDBC (Java Database Connectivity)
🐬 MySQL Database


🧠 How It Works
1. Controller Layer

The Controller class acts as an interface between user input and business logic.
It calls service methods for operations like withdraw and deposit.

2. Service Layer

The service class handles:

Taking input from the user
Calling DAO methods
Displaying success/failure messages
3. DAO Layer

The dao class performs all database operations:

🔹 Withdraw
Fetches balance from database
Checks if sufficient balance exists
Updates balance
🔹 Deposit (Transaction)
Deducts amount from sender
Adds amount to receiver
Uses transaction management (commit/rollback) for safety
4. Database Connection

The dbcon class:

Connects to MySQL using JDBC
Automatically creates database upi_db if it does not exist
5. Main Application

The userApplication class:

Displays menu
Takes user choice
Calls controller methods


🗄️ Database Setup
Database Name:
upi_db
Table: user
CREATE TABLE user (
    Accno INT PRIMARY KEY,
    balance DOUBLE
);


▶️ How to Run
Install MySQL and create database (optional, auto-created)
Update credentials in dbcon.java:
String user = "root";
String pass = "your_password";
Compile the project:
javac UPI_system/*.java
Run the application:
java UPI_system.userApplication


📋 Features
✔️ Withdraw money
✔️ Transfer money between accounts
✔️ Transaction handling (commit/rollback)
✔️ Layered architecture (MVC-like design)


⚠️ Limitations
❌ No user authentication
❌ Console-based UI only
❌ No transaction history
❌ Hardcoded database credentials


🚀 Future Improvements
🔐 Add login/authentication system
📱 Build GUI (Swing / JavaFX)
🌐 Convert into web application (Spring Boot)
📊 Add transaction history
🔔 Notifications for transactions


👨‍💻 Author

Karan Khabale
