import java.util.Scanner;
public class NumbersFactorbyWhileLoop {
	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
		// take user input 
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		
		//check divisibility , print the value
		System.out.print("The value which perfectly divide " + number + " is ");
		if(number > 0) {
			int counter = 1;
			while(counter<number){
				if(number % counter == 0){
					System.out.print(counter+" ");
				}		
				counter++;
			}	
		}
		else {
			System.out.println("Please enter positive number next time ");
		}
		
		// close the scanner object
			scanner.close();
	}		
}	