import java.util.Scanner;
public class GreatestFactor {
	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
		// take user input 
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		int greatestFactor = 1;
		
		// using looping statement to get greatestFactor
		for ( int i = number-1 ; i >= 1; i--){
			if(number % i == 0){
				greatestFactor = i;
				break;
			}	
		}
		
		// printing the result and scanner object close
		System.out.println("The Greatest Factor of "+ number +" is "+ greatestFactor);
		scanner.close();
	}	
			
}	