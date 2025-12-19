import java.util.*;
public class CheckAbundantNumber{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		// Taking user input
        System.out.println("Enter a number:");
        int number=scanner.nextInt();
        int sum=0;

        // applying logic to find sum
        for(int i= 1; i< number;i++) {
            if(number%i == 0){
                sum=sum+i;
            }
        }

        // Printing the results and close scanner object 
        if (sum > number) {
            System.out.println(number+" is an Abundant Number");
        } 
		else {
            System.out.println(number+" is not an Abundant Number");
        }
        scanner.close();
	}
}