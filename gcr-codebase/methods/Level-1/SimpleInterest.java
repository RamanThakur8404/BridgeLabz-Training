import java.util.Scanner;
public class SimpleInterest{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		//take user input
		System.out.println("Enter the Principal Amount, Rate and, Time "); 
		double principalAmount = scanner.nextDouble();
		double rateOfInterest = scanner.nextDouble();
		int time = scanner.nextInt();
		
		// method call 
		double simpleInterest = findsimpleInterest(principalAmount,rateOfInterest,time);
		
		//print the result and close the scanner object
		System.out.println(" \"The Simple Interest is "+ simpleInterest + " for Principal " + principalAmount + ", Rate of Interest " + rateOfInterest + " and Time " + time + "\" ");   
		scanner.close();
	}
	
	// method definition
	public static double findsimpleInterest(double principalAmount, double rateOfInterest, int time){
	return ( principalAmount * rateOfInterest * time ) / 100;
	}
}	