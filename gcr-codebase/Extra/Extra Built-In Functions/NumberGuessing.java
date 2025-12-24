import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowerBound = 1;
        int upperBound = 100;
        String feedback;
        
        System.out.println("Think of a number between 1 and 100.");
        
        while (true) {
            int guess = generateGuess(lowerBound, upperBound);
			System.out.println("Is the guessed number is? " + guess); 
            System.out.println("Enter Feedback whether the number is (high/ low/ correct)");
            feedback = scanner.nextLine().toLowerCase();
            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number.");
                break;
            } 
			else if (feedback.equals("high")) {
                upperBound = guess - 1;  // Adjust the upper bound
            }
			else if (feedback.equals("low")) {
                lowerBound = guess + 1;  // Adjust the lower bound
            }
			else {
                System.out.println("Invalid input! Please enter 'high', 'low', or 'correct'.");
            }
        }
        scanner.close();
    }

    // generate the guess number by computer
    public static int generateGuess(int lower, int upper) {
        Random rand = new Random();
        return rand.nextInt((upper - lower) + 1) + lower;
    }
}
