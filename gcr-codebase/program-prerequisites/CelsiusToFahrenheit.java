import java.util.Scanner;
public class CelsiusToFahrenheit {
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		double celsiusValue = sc.nextDouble();
		
		double fahrenheitValue = ( celsiusValue * 9/5) + 32;
		
		System.out.println(fahrenheitValue);
	}
}	