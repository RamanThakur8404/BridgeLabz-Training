//Create CalculateHarryAge to calculate the current age of harry

public class CalculateHarryAge {

	public static void main(String []args) {

		// Create a variable birthYear to indicate harry's birth year 
		int birthYear = 2000;
		
		//Create a variable currentYear to indicate the current year
		int currentYear = 2024;

		// Create a variable harryAge to indicate the present age
		// by substracting the currentYear and birthYear
		int harryAge = currentYear - birthYear;
		
		// Display the result
		System.out.println("Harry's age in "+ currentYear + " is "+harryAge);
		
	}
}	