// Create a class VolumeOfEarth that compute the volume of earth using volume of sphere formula
public class VolumeOfEarth {
	public static void main(String []args) {
// Create the variable as radiusInKm, PI and assigned value		
	  double radiusInKm = 6378;	
	  double PI = 3.14159;
	  
	// Create a variable volumeInKm that calculate the volume of the earth in kilometers   
	  double volumeInKm = (4.0/3) * PI * Math.pow(radiusInKm,3);
		double volumeInMiles = volumeInKm * 0.239913;
		
	// Dispaly the Result  
	   System.out.println("The volume of earth in cubic kilometers is " + volumeInKm +" and cubic miles is "+volumeInMiles);
	
	}
}	