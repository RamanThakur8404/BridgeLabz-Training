import java.util.Scanner;
public class TrigonometryCalculator {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the angle: ");
        double angle = scanner.nextDouble();
        
		// method call 
		TrigonometryCalculator calculator = new TrigonometryCalculator();
        double[] results = calculator.calculateTrigonometricFunctions(angle);

		// print the output, close the scanner object
        System.out.println(" The given Angle is: " + angle + " degrees");
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
		scanner.close();
    }
	// calculate Trigonometric Functions
	public double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }
}	