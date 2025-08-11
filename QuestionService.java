import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5]; // array to store all the questions

    String[] selection = new String[5]; // array to store the selected answers

    // Constructor to create questions
    public QuestionService(){
        questions[0] = new Question(1, "What language was developed in 1995?", "Java", "Cpp", "Python", "C#", "Java");
        questions[1] = new Question(2, "Which company developed the Java language?", "Sun Microsystems", "Microsoft", "Google", "Apple", "Sun Microsystems");
        questions[2] = new Question(3, "Which keyword is used to create a subclass in Java?", "extends", "implements", "inherits", "super", "extends");
        questions[3] = new Question(4, "Which method is the entry point of a Java program?", "main", "start", "run", "init", "main");
        questions[4] = new Question(5, "Which of these is not a Java primitive type?", "String", "int", "char", "boolean", "String");
    }

    // method to play the quiz
    public void playQuiz(){
        int i = 0;

        // iterate over the questions array and answer each question
        for(Question q: questions){
            System.out.println("Question No. " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in);
            selection[i++] = sc.nextLine();
        }

        for(String s : selection){ // print the entered answers
            System.out.println(s);
        }
    }

    // method to print the score
    public void printScore(){
        int score = 0;

        for(int i = 0; i < questions.length; i++){ // iterate through the questions array and match the actual answers with the entered ones
            Question que = questions[i];
            String answer = que.getAnswer();
            String yourAnswer = selection[i];

            if(answer.equals(yourAnswer)) score++; // if matched -> increment the score
        }
    
        System.out.println("Your score is: " + score); // print the score
        
        // print the actual answers to each question
        System.out.println("Correct answers're: ");
        for(Question i: questions){
            System.out.println("Question: " +i.getQuestion()+ " Answer: " +i.getAnswer());
        }
    }
}