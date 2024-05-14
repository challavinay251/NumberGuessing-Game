import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        guessTheNumber();
    }

    public static void guessTheNumber() {
        int minNum = 1;
        int maxNum = 100;
        Random random = new Random();
        int targetNumber = random.nextInt(maxNum - minNum + 1) + minNum;
        int attempts = 0;
        int maxAttempts = 10;

        System.out.println("Welcome to Guess the Number!");
        System.out.println("I have selected a number between " + minNum + " and " + maxNum + ". Try to guess in " + maxAttempts + " attempts.");

        Scanner scanner = new Scanner(System.in);
        while (attempts < maxAttempts) {
            try {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == targetNumber) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    break;
                } else if (guess < targetNumber) {
                    System.out.println("Your guess is low. Try again.");
                } else {
                    System.out.println("Your guess is high. Try again.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }

        if (attempts >= maxAttempts) {
            System.out.println("Sorry, you've run out of attempts. The number was " + targetNumber + ".");
        }

        scanner.close();
    }
}
