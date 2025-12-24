import java.util.Scanner;
public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		//get input
		System.out.println("Enter three number:");
		int number1 = getInput(scanner);
		int number2 = getInput(scanner);
		int number3 = getInput(scanner);
		
		//display the output
		displayResult(number1,number2,number3);
		scanner.close();
	}
	
	// get the input
	public static int getInput(Scanner scanner){
		return scanner.nextInt();
	}

	// method to display the output
	public static void displayResult(int number1, int number2, int number3){
		int max = Math.max(number1,Math.max(number2,number3));
		System.out.println("The maximum value among 3 number is " + max);
	}	
}	
		