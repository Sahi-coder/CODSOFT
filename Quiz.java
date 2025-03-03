package QuizApplication;
import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] questions = {
                {"What is the capital of France?", "A) Paris", "B) London", "C) Rome", "A"},
                {"What is 5 + 7?", "A) 10", "B) 12", "C) 15", "B"},
                {"Who developed Java?", "A) Microsoft", "B) Apple", "C) Sun Microsystems", "C"}
        };

        int score = 0;
        System.out.println("Welcome to the Quiz!");

        for (String[] q : questions) {
            System.out.println("\n" + q[0]);
            for (int i = 1; i <= 3; i++) {
                System.out.println(q[i]);
            }
            System.out.print("Enter your choice (A/B/C): ");
            String answer = scanner.next().toUpperCase();

            if (answer.equals(q[4])) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong! The correct answer was " + q[4]);
            }
        }

        System.out.println("\nYour Score: " + score + "/" + questions.length);
        scanner.close();
    }
}
