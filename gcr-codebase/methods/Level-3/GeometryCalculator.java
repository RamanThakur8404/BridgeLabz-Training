import java.util.Scanner;

public class GeometryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input points
        System.out.print("Enter the value of x1,y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("\n Enter x2,y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Calculate distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance = " + distance);

        // Calculate line equation
        double[] line = calculateLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of Line: y = " + line[0] + "x + " + line[1]);

        sc.close();
    }

	// Method to calculate Euclidean Distance
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );
    }

    // Method to calculate slope (m) and y-intercept (b)
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - (m * x1);
        return new double[]{m, b};
    }
}