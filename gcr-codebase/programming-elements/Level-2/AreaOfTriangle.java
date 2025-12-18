import java.util.Scanner;
// Create a class AreaOfTriangle to calculate the area of triangle.
public class AreaOfTriangle {
	public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        // declare base and height and take height and base input from user
		double base, height;
        System.out.print("Enter base of triangle : ");
        base = input.nextDouble();
        System.out.print("Enter height of triangle (in inches): ");
        height = input.nextDouble(); 

		// area in square inches and convert to square centimeters
        double areaSquareInches = 0.5 * base * height; 
        double areaSquareCm = areaSquareInches * 6.4516;

		//Display the output
        System.out.println(
            "The area of the triangle is " + areaSquareInches + " sq in and "
            + areaSquareCm + " sq cm");
			
		// close the scanner object
			input.close();
    }
}
