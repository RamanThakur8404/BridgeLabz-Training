import java.util.Scanner;
public class Tablefrom6To9 {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		//declare array multiplicationTable, take input for user
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		int multiplicationResult[] = new int[10];
		
		// applying the logic
		if(number >= 6 && number <=9){
			for(int i=1;i<=multiplicationResult.length;i++){
				multiplicationResult[i-1] = number * i;
				System.out.println(number +" * "+ i +" = "+multiplicationResult[i-1]);
			}	
		}	
		else{
		 System.out.println("Next time, please enter the input between 6 to 9 ");
		}	
		
		//close scanner object
		input.close();
	}	
}		
		