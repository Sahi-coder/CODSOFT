package numberGuessingGame;
import java.util.Scanner;
import java.util.Random;
public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min = 1, max = 100;
        int number = random.nextInt(max - min + 1) + min;
        int attempts = 0, guess;
        boolean guessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between " + min + " and " + max);

        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == number) {
                guessedCorrectly = true;
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            } else if (guess < number) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
        scanner.close();
    }
}
