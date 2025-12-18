import java.util.Scanner;
public class NumberSumByWhileUntilZero1 {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		// taking user input and assign variable total as 0.0
		double total = 0.0;
		System.out.println("Enter the number: ");
		double values = input.nextDouble();
		
		//apply looping statement
		while(true){
			if(values<=0){
			break;
			}
			total += values;
			System.out.println("Enter the number: ");
			values = input.nextDouble();
		}
		
		//printing the output and close the scanner object
		System.out.println("The total value is :" + total);
		input.close();
	}
}	
		
		
		