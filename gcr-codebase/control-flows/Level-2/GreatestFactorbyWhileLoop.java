import java.util.Scanner;
public class GreatestFactorbyWhileLoop {
	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
		// take user input 
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		int greatestFactor = 1;
		
		// using looping statement to get greatestFactor
		int counter = number-1 ;
		while(counter >= 1){
			if(number % counter == 0){
				greatestFactor = counter;
				break;
			}
			 counter--;
		}
		
		// printing the result and scanner object close
		System.out.println("The Greatest Factor of "+ number +" is "+ greatestFactor);
		scanner.close();
	}	
			
}	