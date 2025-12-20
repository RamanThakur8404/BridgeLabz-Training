import java.util.Scanner;
public class WindChill{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		//take user input
		System.out.println("Enter the temperature and wind speed: ");
		int temperature = scanner.nextInt();
		int windSpeed = scanner.nextInt();
		
		// method call 
		WindChill obj = new WindChill();
		double windChill = obj.calculateWindChill(temperature, windSpeed);
		
		//print the result and close the scanner object
		System.out.println("The wind chill temperature is: " + windChill);
		scanner.close();
	}
	// method definition
	public double calculateWindChill(double temperature, double windSpeed){
		double windChill = 0.0;
		windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed,0.16);
		return windChill;
	}	
}	