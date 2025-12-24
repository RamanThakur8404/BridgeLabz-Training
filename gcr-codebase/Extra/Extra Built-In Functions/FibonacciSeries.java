import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number until which you want the fibonacci series numbers ");
		int number = scanner.nextInt();
		
		//applying the logic 
		printFibonacciSeries(number);
		
		// scanner object close
		scanner.close();
	}
	
	// method to print fibonacci series
	public static void printFibonacciSeries(int number){
		int first = 0;
		int second = 1;
		for(int i = 1 ;i<=number; i++){
			System.out.print(first+" ");
			int temp = first + second;
			first = second;
			second = temp;
		}
	}			
}	