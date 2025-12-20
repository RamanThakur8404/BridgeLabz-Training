import java.util.Scanner;
public class CheckNumber{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		//take user input
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		
		//method call
		String numberType = checkNumberType(number);
		
		//print the result and close the scanner object
		System.out.println("The given number is " + numberType + " number ");
		scanner.close();
	}
	
	// method definition
	public static String checkNumberType(int number){
		int value = check(number);
		if(value == 1){
			return "Positive";
		}
		else if(value == -1){
			return "Negative";
		}
		else{
			return "Zero";
		}	
	}
	public static int check(int number){
		if(number > 0){
			return 1;
		}
		else if(number < 0){
			return -1;
		}
		else{
			return 0;
		}
	}
}	