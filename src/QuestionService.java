import java.util.Arrays;
import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    int score = 0;


    public QuestionService(){

        questions[0] = new Question(1, "What is the default value of a boolean variable in Java?",
                new String[]{"A) true", "B) false", "X) 0", "Y) null"}, "B");

        questions[1] = new Question(2, "Which of the following is not a valid Java primitive type?",
                new String[]{"A) int", "B) double", "X) String", "Y) char"}, "X");

        questions[2] = new Question(3, "Which of the following statements about constructors is TRUE?",
                new String[]{"A) Constructors can return a value", "B) Constructors have the same name as the class", "X) Constructors can be static", "Y) Constructors must always take parameters"}, "B");

        questions[3] = new Question(4, "If class B extends class A, which statement is true?",
                new String[]{"A) Class A inherits all methods from class B", "B) Class B inherits all accessible members from class A", "X) You can instantiate class A using an object of class B", "Y) Both classes share the same memory"}, "B");

        questions[4] = new Question(5, "What does method overriding allow you to do?",
                new String[]{"A) Create multiple methods with the same name but different parameters", "B) Provide a new implementation for an inherited method", "X) Call a method without creating an object", "Y) Use static methods across subclasses"}, "B");


}

    public void playQuiz(){

        Scanner play = new Scanner(System.in);

        for (Question q : questions) {
            System.out.println("Question #" + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(Arrays.toString(q.getOptions()));

            String answer;

            while (true) {
                System.out.println("Enter your answer (A, B, C, D): ");
                answer = play.nextLine().trim().toUpperCase();

                if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D")) {
                    break; // valid input
                } else {
                    System.out.println("❌ Input is invalid. Please enter only A, B, C, or D.");
                }
            }

            if (answer.equalsIgnoreCase(q.getAnswer())) {
                System.out.println("✅" + q.getAnswer() + " is correct!");
                score++;
            } else {
                System.out.println("❌ Incorrect. The correct answer is " + q.getAnswer());
            }
            System.out.println();
        }
    }

    public void printScore(){
        System.out.println("\uD83C\uDFAF You got " + score + "/" + questions.length + " correct." );
    }
}
