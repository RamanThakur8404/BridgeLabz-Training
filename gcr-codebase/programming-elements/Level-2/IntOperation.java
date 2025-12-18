// Program to take three integer values a,b, and c from the user and perform Integer Operations.
import java.util.Scanner;

public class IntOperation {
	public static void main(String []args) {
		// Create Scanner object and declare variable that takes input
	    Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter three values :");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		//perform integer Operations 
		int output1 = a + b * c;
		int output2 = a * b + c;
		int output3 = c + a / b;
		int output4 = a % b + c;
		
		//printing output and closing scanner object
		System.out.println("THe results of Int Opertations are " + output1 + ", " + output2 + ", " + output3 + ", and " + output4);
		sc.close();
	}
}	