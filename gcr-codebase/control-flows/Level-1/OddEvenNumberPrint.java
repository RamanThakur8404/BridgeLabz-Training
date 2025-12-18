import java.util.Scanner;
public class OddEvenNumberPrint {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		//declare variable and take user input 
		System.out.println("Enter the number : ");
		int number = input.nextInt();
		
		//using for loop
		for(int value = 1;value<=number;value++){
			if(value % 2 == 0){
				System.out.println("The number "+value+" is Even Number");
			}
			else{
				System.out.println("The number "+value+" is Odd Number");
			}
		}

		//close scanner class object
		input.close();
	}	
}		