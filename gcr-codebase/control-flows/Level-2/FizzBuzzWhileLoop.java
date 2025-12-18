import java.util.Scanner;
public class FizzBuzzWhileLoop {
	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
		//take a number as user input
		System.out.println("Enter the input number : ");
		int input = scanner.nextInt();
		
		//check if positive integer, and apply looping statement
		if(input > 0) {
			int number = 1;
			while (number<=input) {
				if(number % 3 == 0 && number % 5 == 0){
					System.out.println("FizzBuzz");
				}
				else if(number % 3 == 0){
					System.out.println("Fizz");
				}
				else if(number % 5 == 0){
					System.out.println("Buzz");
				}
				else{
					System.out.println(number);
				}
				number++;
			}
		}
		else{
			System.out.println("please enter positive integer");
		}

		//close scanner object
		scanner.close();
	}
}	