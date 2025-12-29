import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		System.out.println(" WELCOME TO NUMBER GUESSING GAME ");
		Random random = new Random();
		int number = random.nextInt(100) + 1;
		int totalAttempts = 5;
		int count = 1;
		int guess = 0;
		do{
			System.out.println("Guess the number between [1-100]: ");
			guess = guessNumber(scanner);
			count++;
			if(number > guess){
				System.out.println("\"Guess high number\"");  
			}
			else if(number < guess){
				System.out.println("\"Guess Low number\"");
			}
			else{
				System.out.println("You guessed the right number"); 
				return;
			}
		}while(count<=totalAttempts);

		if(guess != number){
			System.out.println("Game Over!");
			System.out.println("The correct number is " + number);
		}	
	}

	//method to get the number from user
	public static int guessNumber(Scanner scanner){
		return scanner.nextInt();
	}
}	