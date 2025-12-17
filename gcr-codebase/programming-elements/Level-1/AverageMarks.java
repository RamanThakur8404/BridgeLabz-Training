// Create a class AverageMarks to calculate the average mark of Sam in Physics, Chemistry and Maths. 
public class AverageMarks {
	
	public static void main(String []args) {

		// Create a variable mathsMarks to indicate the marks obtain in maths.
			int mathsMarks = 94;
	
		// Create a variable physicsMarks to indicate the marks obtain in physics.
			int physicsMarks = 95;
	
		// Create a variable chemistryMarks to indicate the marks obtain in chemistry.
			int chemistryMarks = 96;
		
		//Create a variable averageMarks to indicate the average mark after calculation
			int averageMarks = ( mathsMarks + physicsMarks + chemistryMarks ) / 3 ;
	
		// Display the Output
			System.out.println("Sam's average mark in PCM is " + averageMarks);
	}
}	
	