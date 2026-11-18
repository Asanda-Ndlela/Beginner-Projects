# JavaFX Calculator

A simple desktop calculator built with Java and JavaFX. The interface is designed in SceneBuilder (FXML) and styled with CSS.

## Features

- Basic arithmetic: addition, subtraction, multiplication and division
- Clear button to reset the calculator
- Resizable window, with the buttons laid out in a `GridPane` so they scale with the window
- Dark navy theme styled with a CSS stylesheet

## Built With

- Java (JDK 25)
- JavaFX
- SceneBuilder (for the FXML layout)
- Maven

## Project Structure

```
src/main/
├── java/calculator/
│   ├── App.java                    # Application entry point
│   └── CalculatorController.java   # Button handlers and calculator logic
└── resources/calculator/
    ├── calculator-view.fxml        # UI layout (designed in SceneBuilder)
    └── calculator.css              # Styling
pom.xml
```

## Getting Started

### Prerequisites

- JDK 25 installed
- Maven installed (or use the Maven bundled with IntelliJ IDEA)

### Run the App

Clone the repository and run it with Maven:

```bash
git clone <your-repository-url>
cd <repository-folder>
mvn javafx:run
```

Or open the project in IntelliJ IDEA and run the `App` class through the Maven `javafx:run` goal.

## How It Works

1. `App` loads `calculator-view.fxml` with `FXMLLoader` and shows it in a window.
2. The FXML file links to `CalculatorController` through `fx:controller`.
3. Digit buttons share one handler, operator buttons share another, and the `=` button calculates the result.

## Author

<Asanda Ndlela>
