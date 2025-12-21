import java.lang.Math;
import java.util.Scanner;
public class RandomNumbers{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = scanner.nextInt();
		
		// obtain number, calculate answer
		int[] numbers = generate4DigitRandomArray(size);
		double[] answer = findAverageMinMax(numbers);
		
		//print numbers, answers
		System.out.println("The random number obtained are: ");
		for(int i = 0; i<numbers.length; i++){	
			System.out.print(numbers[i]+" ");
		}
		System.out.println("\nThe average of this random number is "+answer[0]+", minimum number is "+answer[1]+", and maximum number is "+answer[2]);
		
		scanner.close();
	}
	
	// Generate the 4 digit random number array of given size
	public static int[] generate4DigitRandomArray(int size){
		int[] arr = new int[size];
		for(int i=0;i<size;i++){
		arr[i] = (int)(Math.random()*9000 + 1000);
		}
		return arr;
	}
	
	// calculate the average, minimum, maximum from that array
	public static double[] findAverageMinMax(int[] numbers){	
		double average = 0;
		double minimum = Integer.MAX_VALUE;
		double maximum = Integer.MIN_VALUE;
		for(int i=0;i<numbers.length;i++){
			average+=numbers[i];
			minimum=Math.min(minimum,numbers[i]);
			maximum=Math.max(maximum,numbers[i]);
		}
		 average /= numbers.length;
		 return new double[] {average,minimum, maximum};
	}
}