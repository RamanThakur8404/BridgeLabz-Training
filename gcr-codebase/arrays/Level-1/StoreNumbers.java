import java.util.Scanner;
public class StoreNumbers {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		//declare array number, take input for user
		double number[] = new double[10];
		double total = 0.0;
		int index = 0;
		
		// applying the logic
		while(true){
			System.out.println("Enter the number: ");
			int value = input.nextInt();
			if(index >= 10){
				break;
			}
			if(value > 0){
				number[index] = value;
				index++;
			}
			else {
				System.out.println("You have entered 0 or negative number");
				break;
			}	
		
		}	
		for(int i=0;i<=index;i++){
			
			total += number[i]; 
		}
		
		//print the result and scanner object close
		System.out.println("The result: " + total);
		input.close();
	}	
}		
		