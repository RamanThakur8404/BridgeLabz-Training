// Create a class named as KilometerToMileConversion to convert the kilometers into miles.
	public class KilometerToMileConversion {
	
		public static void main(String []args) 	{
		
		// Create a variable distanceInOneKilometers to indicate the distance in one kilometer
		double distanceInOneKilometers = 1.6;

		// Create a variable distanceGivenInKilometers to indicate the distance given to us in kilometers
		double distanceGivenInKilometers = 10.8;
		
		// Create a variable distanceInMiles that indicate the conversion of distance in miles.
		double distanceInMiles = distanceGivenInKilometers*distanceInOneKilometers;
		
		// Display the result
		System.out.println("The distance " + distanceGivenInKilometers + " km in miles is "+distanceInMiles);
	}	
}		
		