import java.util.Scanner;
public class CalculatePowerbyWhileLoop {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		// take user input 
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		System.out.println("Enter the power: ");
		int power = scanner.nextInt();
		
		
		// check number and power is positive 
		if(number > 0 && power >0){
			int result = 1, counter = 0;
			while( counter != power){
				result *= number;
				counter++ ;
			}
			System.out.println("The result is "+ result);
        }
		else{
		System.out.println("Invalid input");
		}
		
		//scanner object close
		scanner.close();
	}	
			
}	