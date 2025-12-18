import java.util.Scanner;
public class NaturalNumberSumbyForLoop {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		//declare variable number and user input 
		System.out.println("Enter the number : ");
		int number = input.nextInt();
		
		// check if natural number, then calculate sum by formula and with looping statement
		if(number > 0) {
			System.out.println("The number is a positive integer then the output is YES");
			int sum = 0,sum1 = 0;
			sum = number * (number + 1) / 2;
			for(int value = 1;value<=number;value++){
				sum1+=value;
			}
            if(sum == sum1){
				System.out.println("Yes, both computations are correct");
			}
			else{
				System.out.println("No, both computations are correct");
			}
		}
		else {
			System.out.println("If the number is a positive integer then the output is NO");
		}
		
		//close the Scanner object
		input.close();
	}
}	
		
		