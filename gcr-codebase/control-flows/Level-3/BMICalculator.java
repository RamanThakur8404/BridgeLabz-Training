import java.util.*;
public class BMICalculator{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		// Taking user input
        System.out.println("Enter weight in kg:");
        double weight = scanner.nextDouble();
        System.out.println("Enter height in cm:");
        double heightInCm = scanner.nextDouble();
		String status;

        // check for BMI
        double heightInMeter= heightInCm/100;
        double bmi = weight/(heightInMeter* heightInMeter);
        if(bmi <= 18.4) {
            status ="Underweight";
        }
		else if(bmi >= 18.5 && bmi <= 24.9) {
            status ="Normal";
        }
		else if(bmi >= 25.0 && bmi <= 39.9) {
            status ="Overweight";
        }
		else{
            status ="Obese";
        }

        // Printing the results and close scanner object
        System.out.println("BMI is "+bmi+"\nWeight Status: "+status);
        scanner.close();
	}
}