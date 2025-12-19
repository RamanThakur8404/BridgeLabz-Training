import java.util.Scanner;
public class FactorsOfNumber {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		// declare array named factors
		int number = scanner.nextInt();
		int maxIndex = 10;
		int []factors = new int[maxIndex];
		int index = 0;

		// obtain the factor
		for(int i = 1;i <= number ; i++){
			 if(number % i == 0){
				if(index == maxIndex){
					maxIndex *= 2; 
					int []temp = new int[maxIndex];
					for(int j = 0; j < factors.length;j++){
						temp[j] = factors[j];
					}
					factors = temp;
				}
				factors[index] = i;
				index++;
			 }
		}
		
		//display the output, close scanner object
		for(int i=0;i<index;i++){
			System.out.println(factors[i]+" ");
		}		
		scanner.close();
	}
}	