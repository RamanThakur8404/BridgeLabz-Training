import java.util.Scanner;
public class CountDigits {
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		// Taking user input
        System.out.println("Enter a number:");
        int number=scanner.nextInt();
		int originalNumber = number;
        int count=0;

        // Applying logic 
        if(number==0){
            count=1;
        }
		else{
            while(number != 0) {
                number /= 10;
                count++;
            }
        }

        // Printing the result and scanner object close
        System.out.println("The number of digits present in "+ originalNumber +" is " + count);
        scanner.close();
	}
}