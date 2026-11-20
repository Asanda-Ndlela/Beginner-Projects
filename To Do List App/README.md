# ToDoList

A simple to-do list desktop application built with Java and JavaFX. Type in a task, add it to a numbered list, and save the list to a text file.

## Features

- Add tasks to an automatically numbered list
- Input validation: empty entries are rejected with an error message
- Leading numbers you type (e.g. `3. Buy milk`) are stripped so numbering stays consistent
- Clear the whole list with one click
- Save the list to a text file (`To-Do-List.txt`)

## Tech Stack

- Java 25 (JDK 25)
- JavaFX 27.0.1 (`javafx-controls`, `javafx-fxml`)
- Maven (with the `javafx-maven-plugin`)

## Requirements

- JDK 25 installed
- Maven installed (or use the Maven bundled with your IDE)

## Getting Started

## Usage

1. Type a task into the text field.
2. Click **Add** to put it on the list. It appears numbered in the list area.
3. Click **Save** to write the list to `To-Do-List.txt` in the folder the app is run from.
4. Click **Clear** to empty the list and start again.

## Project Structure

```
ToDoList/
├── pom.xml
├── src/
│   └── main/
│       ├── java/toDoListApp/
│       │   ├── Main.java
│       │   └── Controller.java
│       └── resources/
│           └── (FXML layout)
└── README.md
```

> Adjust the file names to match your project.

## Possible Improvements

- Mark individual tasks as done or delete a single task
- Load a saved list when the app starts
- Add due dates and priorities

## Author

Asanda Ndlela
