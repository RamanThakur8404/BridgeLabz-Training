import java.util.Scanner;
public class NumbersFactorbyForLoop {
	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
		// take user input 
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		
		//check divisibility , print the value
		System.out.print("The value which perfectly divide " + number + " is ");
		for ( int i=1; i < number; i++){
			if(number % i == 0){
				System.out.print(i+" ");
			}		
		}

		// close the scanner object
			scanner.close();
	}		
}	