import java.util.Scanner;
public class TriangularPark{
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		//take user input
		System.out.println("Enter the sides(meters) of park: "); 
		double sideOne = input.nextDouble();
		double sideTwo = input.nextDouble();
		double sideThird = input.nextDouble();
		double distance = 5.0;
		// 1m = 0.001 kilometre
		//method call
		int numberOfRounds = findNumberOfRounds(sideOne,sideTwo,sideThird,distance);
		
		//print the result and close the scanner object
		System.out.println("The number of round user covered in 5 km run are " + numberOfRounds);
		input.close();
	}
	
	// find number of rounds
	public static int findNumberOfRounds(double sideOne, double sideTwo, double sideThird,double distance){
		// find perimeter of triangle
		double perimeter = findPerimeterOfTriangle(sideOne,sideTwo,sideThird);
		  
		double distanceInMeter = distance * 1000;
		return (int)Math.ceil(distanceInMeter / perimeter);  
	}
	
	// find perimeter
	public static double findPerimeterOfTriangle(double sideOne, double sideTwo, double sideThird){
		return sideOne + sideTwo + sideThird;
	}
}	