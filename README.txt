💻✨ Project Name: Quiz Console App
🌟 Overview:
This Java console-based application allows users to play a multiple-choice quiz. The quiz consists of 5 hardcoded questions, and users enter their answers via the keyboard. After completing the quiz, the app displays the user's score along with the correct answers.


🧠 Key Components:
📦 Question.java – The Blueprint
This class defines the Question object, which holds:
    An id
    The question text
    Four options (opt1 to opt4)
    The correct answer

Includes:
    Getters and setters for all properties
    A toString() method for easy debugging

This is where your questions live, waiting to be answered.


🛠️ QuestionService.java – The Brain
This class does all the tasks:
    1. Holds 5 questions in an array, initialized in the constructor.
    2. Stores user's answers in a separate selection[] array.
    3. Includes two main methods:
        playQuiz():
            Loops through each question
            Displays the options
            Takes input from the user

        printScore():
            Compares user answers to correct ones
            Calculates and displays the score
            Prints the correct answers for review


🚀 Main.java – The Entry Point
This class:
    Creates a QuestionService object
    Starts the quiz using playQuiz()
    Shows the score using printScore()


🎯 Features:
    Fully functional MCQ quiz
    Clean OOP structure (encapsulation through getters/setters)
    Accepts user input via Scanner
    Calculates and displays final score
    Reveals correct answers post-quiz


💡 Possible Enhancements:
    Timer for each question ⏳
    Random question shuffling 🔀
    File/database-based question loading 📄
    GUI using Swing or JavaFX 🎨
    Add difficulty levels or categories 🎮