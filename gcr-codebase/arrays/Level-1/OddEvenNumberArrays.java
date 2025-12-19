import java.util.Scanner;
public class OddEvenNumberArrays {
	public static void main(String []args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = read.nextInt();
		int size = number / 2 + 1;
		int []oddArray = new int[size];
		int []evenArray = new int[size];
		int oddIndex = 0;
		int evenIndex = 0;
		
		
		// check if natural no., store them in given array
		if(number < 0){
			System.out.println("Invalid Input");
			System.exit(0);
		}
		else{
			for(int i=1;i<=number;i++) {
				if(i % 2 == 0){
				 evenArray[evenIndex] = i;
				 evenIndex++;
				}
				else{
				oddArray[oddIndex] = i;
				oddIndex++;
				}
			}
			System.out.println("The even array elements are: "); 
			for(int i=0;i<evenIndex;i++){
				System.out.print(evenArray[i]+" ");
			}
			System.out.println("\nThe odd array elements are: "); 
			for(int i=0;i<oddIndex;i++){
				System.out.print(oddArray[i]+" ");
			}	
		}
		
		// close scanner object
		read.close();
	}
}	