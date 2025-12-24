import java.util.Scanner;

public class GcdAndLcmCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

		//display the result
        System.out.println("GCD: " + calculateGCD(num1, num2));
        System.out.println("LCM: " + calculateLCM(num1, num2));
        sc.close();
    }

    // method to calculate GCD
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp
        }
        return a;
    }

    // method to calculate LCM
    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }
}