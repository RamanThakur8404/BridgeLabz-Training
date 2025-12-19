import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		//declare array multiplicationTable, take input for user
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		int multiplicationTable[] = new int[10];
		
		// applying the logic
		for(int i=1;i<=multiplicationTable.length;i++){
			multiplicationTable[i-1] = number * i;
		}
			
		//print the statement and close scanner object
		for(int i=1;i<=multiplicationTable.length;i++){
			System.out.println(number +" * "+ i +" = "+multiplicationTable[i-1]);
		}
		input.close();
	}	
}		
		