import java.util.Scanner;
public class FizzBuzz {
	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
		//take a number as user input
		System.out.println("Enter the input number : ");
		int input = scanner.nextInt();
		String []result = new String[input+1];
		
		//check if positive integer, and apply looping statement
		if(input > 0) {
			for (int number = 1 ; number <= input ; number++) {
				if(number % 3 == 0 && number % 5 == 0){
					result[number] = "FizzBuzz";
				}
				else if(number % 3 == 0){
					result[number] = "Fizz";
				}
				else if(number % 5 == 0){
					result[number] = "Buzz";
				}
				else{
					result[number] = String.valueOf(number);
				}
			}
			for(int i=1;i<=input;i++){
				System.out.println("Position "+ i + " = " + result[i]);
			}	
		}
		else{
			System.out.println("Invalid Input");
		}

		//close scanner object
		scanner.close();
	}
}	