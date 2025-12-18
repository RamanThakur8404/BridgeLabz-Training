import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		//declare variable and take user input 
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		
		// check whether the input is between 6 to 9
		// if yes, print the multiplication table
		if(number>=6 && number<=9){
			for(int i=1;i<=10;i++){
				System.out.println(number + " * " + i + " = " + number*i);
			}
		}
		else{
			System.out.println("Sorry, can't print multiplication table because the given input is not between 6 to 9(both inclusive).");
		}
	
		//close the scanner object
		scanner.close();
	}
}	