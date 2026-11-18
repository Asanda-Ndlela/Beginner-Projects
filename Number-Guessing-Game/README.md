# Number Guessing Game

A simple desktop number guessing game built with **Java** and **JavaFX**. The game picks a random number between 1 and 50, and you try to guess it. After every guess you're told whether to go higher or lower until you get it right.

## Features

- Random target number between 1 and 50
- Hints after each guess: "Guess Higher" or "Guess Lower"
- Input validation: non-integer input shows an "Enter an Integer" message
- A new number is generated automatically after a correct guess
- Dark-themed UI styled with CSS
- Exit button to close the game

## How to Play

1. Launch the game.
2. Type a whole number into the input field.
3. Click **Submit Guess**.
4. Follow the hint on screen until you see **GREAT JOB!!!!!**.
5. Keep playing with a new number, or click **Exit** to quit.

## Tech Stack

- Java (JDK 17 or newer; developed with JDK 25)
- JavaFX (FXML layout, built with SceneBuilder)
- CSS for styling

## Getting Started

### Prerequisites

- [JDK 17+](https://jdk.java.net/)
- [JavaFX SDK](https://gluonhq.com/products/javafx/) (not needed if your build tool, such as Maven, downloads it for you)


### Run with Maven (if the project includes a `pom.xml` with the JavaFX plugin)

```bash
mvn clean javafx:run
```

## Author

Asanda Ndlela
