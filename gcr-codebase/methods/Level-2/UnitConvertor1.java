import java.util.Scanner;
public class UnitConvertor1 {
	public static void main(String []args) {
		// Create Scanner class variable input
		Scanner input = new Scanner(System.in);	
		System.out.println("Enter the name of the unit  : km / miles / meters / feet ");
		String unit= input.next();
		System.out.println("Enter the value of the unit:");
		double value = input.nextDouble();
		
		// check the unit, apply logic and Printing the results
		if(unit.equals("km")){
			System.out.println(value + " km " + convertKmToMiles(value) + " miles");
		}
		else if(unit.equals("miles")){
			System.out.println(value + " miles: " + convertMilesToKm(value) + " km");
		}
		else if(unit.equals("meters")){
			System.out.println(value + " meter: " + convertMetersToFeet(value) + " feet");
		}
		else if(unit.equals("feet")){
			System.out.println(value + " feet: "+convertFeetToMeters(value)+" meter");
		}
		input.close();	
	}
	// Method to convert Km to Miles
	public static double convertKmToMiles(double km) {
		return km*0.621371;
	}
	
	// Method to convert Miles to km
	public static double convertMilesToKm(double miles) {
		return miles*1.60934;
	}
	
	// Method to convert meters to feet
	public static double convertMetersToFeet(double meter) {
		return meter*3.28084;
	}
	
	// Method to convert feet to meters
	public static double convertFeetToMeters(double feet) {
		return feet*0.3048;
	}
}