import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        // Create Scanner object to take input from user for height and weight
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height in meters: ");
        double heightInMeters = scanner.nextDouble();
        System.out.print("Enter weight in kilograms: ");
        double weightInKg = scanner.nextDouble();

        // Calculate BMI using the given formula
        double bmi = weightInKg / (heightInMeters * heightInMeters);


        // determine BMI and, print category using if-else conditions
        System.out.print("Your BMI is: " + bmi + "\nBMI Category: ");
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal");
        } else {
            System.out.println("Overweight");
        }

        // Close scanner object
        scanner.close();
    }
}