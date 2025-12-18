import java.util.Scanner;
public class NumberCheck {
	public static void main(String []args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = read.nextInt();
		
		//check type of number using conditional statement
		if(number > 0 ){
			System.out.println("positive");
		}
		else if(number < 0 ){
			System.out.println("negative");
		}
		else{
			System.out.println("zero");
		}

		//close the scanner object
		read.close();
	}
}	