import java.util.Scanner;
public class MultiplesUnder100byWhileLoop {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		// take user input 
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		
		// check number is positive and less than 100
		if(number > 0 && number <= 100){
			System.out.println("The multiple of "+ number +" less than 100 are: ");
			int counter = 100;
			while( counter > 1 ){
				if(counter % number == 0){
					System.out.print(counter+" ");
				}
				counter--;
			}
        }
		else{
		System.out.println("Enter positive number or less than 100");
		}
		
		//scanner object close
		scanner.close();
	}	
			
}	