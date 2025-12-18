// Program to take three double values a,b, and c from the user and perform Double Operations.
import java.util.Scanner;

public class DoubleOperation {
	public static void main(String []args) {
		// Create Scanner object and declare variable that takes input
	    Scanner sc = new Scanner(System.in);
		double a, b, c;
		System.out.println("Enter three values :");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		//perform Double Operations 
		double output1 = a + b * c;
		double output2 = a * b + c;
		double output3 = c + a / b;
		double output4 = a % b + c;
		
		//printing output and closing scanner object
		System.out.println("THe results of Double Opertations are " + output1 + ", " + output2 + ", " + output3 + ", and " + output4);
		sc.close();
	}
}	