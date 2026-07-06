# Address Book Management System

## Overview

This project is a Java-based Address Book Management System developed to understand Object-Oriented Programming concepts and Java Collection Framework. The project starts with creating a single contact and gradually extends to managing multiple contacts and multiple address books using different Java collections.

Each use case builds on the previous one to improve the functionality of the application.

---

## Concepts Covered

- Classes and Objects
- Constructors
- Instance Variables
- Methods
- Encapsulation
- Object-Oriented Programming (OOP)
- Scanner Class
- Arrays and ArrayList
- HashMap (Dictionary)
- Loops
- Conditional Statements
- Method Calling
- User Input Handling

---

## Use Cases Implemented

### UC1 - Create Contact

- Created a Contact class.
- Stored contact details such as:
  - First Name
  - Last Name
  - Address
  - City
  - State
  - Zip
  - Phone Number
  - Email
- Displayed the contact details.

---

### UC2 - Add Contact

- Created an Address Book class.
- Added a contact to the Address Book.
- Displayed the added contact.

---

### UC3 - Edit Contact

- Edited an existing contact using the person's first name.
- Updated the contact details using console input.

---

### UC4 - Delete Contact

- Deleted an existing contact using the person's first name.
- Displayed an appropriate message after deletion.

---

### UC5 - Add Multiple Contacts

- Added multiple contacts to a single Address Book.
- Used `ArrayList` to store all contacts.
- Displayed all contacts stored in the Address Book.

---

### UC6 - Multiple Address Books

- Created multiple Address Books.
- Assigned a unique name to each Address Book.
- Used `HashMap` to maintain Address Book Name and Address Book.
- Allowed the user to create and manage multiple Address Books.

---

## Project Structure

```
AddressBook
│
├── AddressBookUC1.java
├── AddressBookUC2.java
├── AddressBookUC3.java
├── AddressBookUC4.java
├── AddressBookUC5.java
└── AddressBookUC6.java
```

---

## How to Run

1. Open the project in Eclipse.
2. Compile the required Java file.
3. Run the program.
4. Enter the required details through the console.
5. View the output in the console.

---

## Collections Used

| Collection | Purpose |
|------------|---------|
| ArrayList | Stores multiple contacts in an Address Book |
| HashMap | Stores multiple Address Books using a unique name |

---

## Features

- Create Contact
- Add Contact
- Edit Contact
- Delete Contact
- Add Multiple Contacts
- Display All Contacts
- Create Multiple Address Books
- Store Address Books using HashMap
- Console-based User Interaction

---

## What I Learned

Through this project, I learned how to build a simple Java application using OOP concepts. I also understood how Java Collections like `ArrayList` and `HashMap` can be used to manage multiple objects efficiently. The project helped me improve my understanding of classes, objects, constructors, methods, user input handling, and organizing code into reusable components.
