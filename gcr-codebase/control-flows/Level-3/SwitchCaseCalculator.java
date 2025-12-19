import java.util.*;
public class SwitchCaseCalculator{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		// Taking user input
        System.out.println("Enter first number:");
        double first = input.nextDouble();
        System.out.println("Enter second number:");
        double second = input.nextDouble();
        System.out.println("Enter the operator (+, -, *, /):");
        String op = input.next();

        // using switch-case statement ,close scanner object
        switch(op){
            case "+":
                System.out.println("Result: "+(first + second));
                break;
            case "-":
                System.out.println("Result: "+(first - second));
                break;
            case "*":
                System.out.println("Result: "+(first * second));
                break;
            case "/":
                if(second!=0){
                    System.out.println("Result: "+(first / second));
                }
				else{
                    System.out.println("if second number is zero we cann't apply division");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
        input.close();
	}
}