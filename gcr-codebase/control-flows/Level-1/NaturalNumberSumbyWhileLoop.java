import java.util.Scanner;
public class NaturalNumberSumbyWhileLoop  {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		//declare variable number and user input 
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		
		// check if natural number, then calculate sum by formula and with looping statement
		if(number > 0) {
			System.out.println("The number is a positive integer then the output is YES");
			int sum = 0,sum1 = 0;
			sum = number * (number + 1) / 2;
			while(number!=0){
				sum1+=number;
				number--;
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
		scanner.close();
	}
}	
		
		
	