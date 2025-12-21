import java.util.Scanner;
public class UnitConvertor3 {
	public static void main(String []args) {
		// Create Scanner class variable input
		Scanner input = new Scanner(System.in);	
		System.out.println("Enter the name of the unit  : farhenheit2celsius / celsius2farhenheit / kilograms2pounds / pounds2kilograms / gallons2liters / liters2gallons ");
		String unit= input.next();
		System.out.println("Enter the value of the unit:");
		double value = input.nextDouble();
		
		// check the unit, apply logic and Printing the results
		if(unit.equals("farhenheit2celsius")){
			System.out.println(value + " farhenheit " + convertFarhenheitToCelsius(value) + " celsius");
		}
		else if(unit.equals("celsius2farhenheit")){
			System.out.println(value + " celsius: " + convertCelsiusToFarhenheit(value) + " farhenheit");
		}
		else if(unit.equals("pounds2kilograms")){
			System.out.println(value + " pounds: " + convertPoundsToKilograms(value) + " kilograms");
		}
		else if(unit.equals("kilograms2pounds")){
			System.out.println(value + " kilograms: " + convertKilogramsToPounds(value) + " pounds");
		}
		else if(unit.equals("gallons2liters")){
			System.out.println(value + " gallons: " + convertGallonsToLiters(value) + " liters");
		}
		else if(unit.equals("liters2gallons")){
			System.out.println(value + " liters: " + convertLitersToGallons(value) + " gallons");
		}
		
		input.close();	
	}
	// Method to convert farhenheit to celsius
	public static double convertFarhenheitToCelsius(double farhenheit) {
		return (farhenheit - 32) * 5 / 9;
	}
	// Method to convert celsius to farhenheit
	public static double convertCelsiusToFarhenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}
	// Method to convert pounds to kilograms
	public static double convertPoundsToKilograms(double pounds) {
		return pounds*0.453592;
	}
	// Method to convert kilograms to pounds
	public static double convertKilogramsToPounds(double kilograms) {
		return kilograms*2.20462;
	}
	// Method to convert gallons to liters
	public static double convertGallonsToLiters(double gallons) {
		return gallons*3.78541;
	}
	// Method to convert liters to gallons
	public static double convertLitersToGallons(double liters) {
		return liters*0.264172;
	}
	
}