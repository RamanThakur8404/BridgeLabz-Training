import java.util.*;
public class HarshadNumber{
	public static void main(String []args){
		Scanner read = new Scanner(System.in);
		// Taking user input
        System.out.println("Enter a number:");
        int number=read.nextInt();
        int originalNumber=number;
        int sum =0;

        //applying logic to find sum of digits
        while(number!=0) {
            int digit =number%10;
            sum = sum+digit;
            number= number/10;
        }

        //Printing the result and close scanner object
        if(sum!=0 && originalNumber%sum==0) {
            System.out.println(originalNumber+" is a Harshad Number");
        } 
		else{
            System.out.println(originalNumber+" is not a Harshad Number");
        }
        read.close();
	}
}