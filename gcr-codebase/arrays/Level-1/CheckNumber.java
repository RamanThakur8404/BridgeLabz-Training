import java.util.Scanner;
public class CheckNumber {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		//declare array age, take input for user
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		System.out.println("Enter the " + number +" elements : ");
		int element[] = new int[number];
		for(int i=0;i<element.length;i++) {
			element[i] = input.nextInt();
		}
		
		// applying the logic
		for(int i=0;i<element.length;i++){
			if(element[i] > 0){
				if(element[i] % 2 == 0){
                     System.out.println(element[i] + " is Even Number");
				}
				else{
					System.out.println(element[i] + " is Odd Number");
				}
			}
			else if(element[i] < 0){
				System.out.println(element[i] + " is Negative Number");
			}
			else{
				System.out.println("Zero");
			}	
		}
		//comparison of first and last element 
		if( element[0] == element[element.length-1] ){
			System.out.println("The first and last element are equal");
		}
		else if( element[0] > element[element.length-1] ){
			System.out.println("The first element is greater than last element");
		}
		else{
			System.out.println("The first element is lesser than last element");
		}	
		
		// close scanner object
		input.close();
	}	
}		
		