import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String []args) {
		
	Scanner sc = new Scanner(System.in);

		System.out.println("Enter the radius of the circle : ");
		double radius = sc.nextDouble();
		
		double area = 0.0;
		area = 3.14 * radius * radius;
		
		System.out.println("The area of Circle is : "+area);
	}
}