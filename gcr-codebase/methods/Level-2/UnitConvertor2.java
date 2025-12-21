import java.util.Scanner;
public class UnitConvertor2 {
	public static void main(String []args) {
		// Create Scanner class variable input
		Scanner input = new Scanner(System.in);	
		System.out.println("Enter the name of the unit  : yards2feet / feet2yards / inches2meters / meters2inches / inches2cm ");
		String unit= input.next();
		System.out.println("Enter the value of the unit:");
		double value = input.nextDouble();
		
		// check the unit, apply logic and Printing the results
		if(unit.equals("yards2feet")){
			System.out.println(value + " yards " + convertYardsToFeet(value) + " feet");
		}
		else if(unit.equals("feet2yards")){
			System.out.println(value + " feet: " + convertFeetToYards(value) + " yards");
		}
		else if(unit.equals("inches2meters")){
			System.out.println(value + " inches: " + convertInchesToMeters(value) + " meters");
		}
		else if(unit.equals("meters2inches")){
			System.out.println(value + " meters: " + convertMetersToInches(value) + " inches");
		}
		else if(unit.equals("inches2cm")){
			System.out.println(value + " inches: "+convertInchesToCm(value)+" cm");
		}
		input.close();	
	}
	// Method to convert yards to feet
	public static double convertYardsToFeet(double yards) {
		return yards*3;
	}
	// Method to convert feet to yards
	public static double convertFeetToYards(double feet) {
		return feet*0.333333;
	}
	// Method to convert meters to inches
	public static double convertMetersToInches(double meter) {
		return meter*39.3701;
	}
	// Method to convert inches to meters
	public static double convertInchesToMeters(double inches) {
		return inches*0.0254;
	}
	// Method to convert inches to cm
	public static double convertInchesToCm(double inches) {
		return inches*2.54;
	}
}