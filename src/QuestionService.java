import java.util.Arrays;

public class QuestionService {

    Question[] questions = new Question[5];

public QuestionService(){

    questions[0] = new Question(1,"What is the default value of a boolean variable in java?", new String[]{"A) true","B) false", "C) 0", "D) null"},"B");
    questions[1] = new Question(2, "Which of the follow is not a valid Java primitive type?", new String[]{"A) int", "B) double", "C) String", "char"}, "String");
    questions[2] = new Question(3, "Which of the following statements about constructors is TRUE?", new String[]{"A) Constructors can return a value", "B) Constructors have the same name as the class", "C) Constructors can be static", "D) Constructors must always take parameters"}, "B");
    questions[3] = new Question(4, "If class B extends class A, which statement is true?", new String[]{"A) Class A inherits all methods from class B", "B) Class B inherits all accessible members from class A", "C) You can instantiate class A using an object of class B", "D) Both classes share the same memory"}, "B");
    questions[4] = new Question(5, "What does method overriding allow you to do?", new String[]{"A) Create multiple methods with the same name but different parameters", "B) Provide a new implementation for an inherited method", "C) Call a method without creating an object", "D) Use static methods across subclasses"}, "B");

}

    public void displayQuestions(){

        for (Question question : questions){
            System.out.println(question);
        }
    }
}
