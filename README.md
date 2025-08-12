# 🧠 Java Quiz Console App

This is a **console-based multiple-choice quiz application** built using **Core Java**. It demonstrates object-oriented programming concepts such as classes, encapsulation, and array handling. Users answer 5 questions, and the app calculates and displays their score with correct answers at the end.

---

## 📌 Overview

- 5 hardcoded multiple-choice questions
- User selects answers via keyboard input
- Final score and correct answers are displayed after the quiz

---

## 🛠️ Key Components

### 📦 `Question.java` – The Blueprint
Defines the `Question` object with:
- Question ID
- Question text
- Four options (`opt1` to `opt4`)
- Correct answer

Includes:
- Getters and setters for all fields
- `toString()` method for debugging

---

### 🧠 `QuestionService.java` – The Brain
Handles the quiz logic:
- Initializes an array of 5 `Question` objects
- Stores user answers in a separate `selection[]` array

Main methods:
- `playQuiz()`:  
  - Loops through each question  
  - Displays options and collects user input
- `printScore()`:  
  - Compares user answers with correct ones  
  - Displays score and correct answers

---

### 🚀 `Main.java` – Entry Point
- Creates an instance of `QuestionService`
- Runs the quiz using `playQuiz()`
- Shows the score using `printScore()`

---

## ✨ Features
- Clean object-oriented structure
- Fully working MCQ quiz in the console
- Score calculation + answer review
- User input handling with `Scanner`

---

## 🛠 Technologies Used
- Java (JDK 8+)
- Console / Terminal

---

## 🚀 How to Run

1. Clone the repository:
   git clone https://github.com/ExorXis/Quiz-Console-App.git

2. Compile the files:
   javac Main.java Question.java QuestionService.java

3. Run the app:
   java Main

> Make sure Java is installed and your terminal is in the correct folder.

---

## 💡 Future Enhancements

- ⏳ Add timer for each question  
- 🔀 Shuffle questions randomly  
- 📄 Load questions from a file or database  
- 🎨 Add a GUI with JavaFX or Swing  
- 🧩 Add difficulty levels or categories  

---

## 📌 Author

Made with ☕ by Alok Verma (a.k.a. ExorXis) as part of my Java learning journey.
