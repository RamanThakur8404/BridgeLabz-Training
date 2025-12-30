// Java program for Temperature Logger

import java.util.Scanner;
public class TemperatureLogger{
	public static final int DAYS = 7;
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		double []temperature = new double[DAYS];
		
		// initialize the array
		System.out.println("Enter the temperatures: ");
		for(int i = 0; i < temperature.length; i++){
			temperature[i] = scanner.nextDouble();
		}
		
		//applying the logic
 		double averageTemperature = getAverageTemperature(temperature);
		double maxTemperature = getMaximumTemperature(temperature);
		
		// display the result
		System.out.println("The average Temperature of  the given temperature is: " + averageTemperature);
		System.out.println("The average Temperature of  the given temperature is: " + maxTemperature);
	}
	
	// method to find Average Temperature
	public static double getAverageTemperature(double []temps){
		double average = 0.0;
		double total = 0.0;
		for(double temp:temps){
			total += temp;
		}
		average = total / temps.length;
		return average;
	}

	// method to find max Temperature
	public static double getMaximumTemperature(double []temps){
		double max = Double.MIN_VALUE;
		for(double temp : temps){
			if(max < temp){
				max = temp;
			}
		}
		return max;
	}	
}