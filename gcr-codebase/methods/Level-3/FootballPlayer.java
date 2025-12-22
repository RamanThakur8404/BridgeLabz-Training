import java.util.Scanner;
public class FootballPlayer {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of football team player: ");
		int size = scanner.nextInt();
		
		// get shortest, tallest and mean height of player
		double height[] = getRandomHeight(size);
		System.out.println("The random height of the team player: ");
		for(int i=0; i<size; i++){
			System.out.print(height[i]+" ");
		}	
		double totalSum = findSum(height);
		double shortest = findShortest(height);
		double tallest = findTallest(height);
		double meanHeight = findMeanHeight(height);
		
		
		//print the height, close scanner
		System.out.println("\nThe sum of all player in football team is " +totalSum+"\nThe shortest player is " + shortest +", tallest is " + tallest + " mean height of football team "+meanHeight);
	}
	// method to generate random height
	public static double []getRandomHeight(int size){
		double store[] = new double[size];
		for(int i = 0; i<size; i++){
			store[i] = (int)(Math.random() * 101) + 150;
		}
	    return store;
	}
	
	// method to get shortest  
	public static double findShortest(double []height){
		double shortest = Integer.MAX_VALUE;
		for(int i=0; i<height.length; i++){
			shortest = Math.min(shortest, height[i]);
		}
		return shortest;
	}
	
	// method to get tallest
	public static double findTallest(double []height){
		double tallest = Integer.MIN_VALUE;
		for(int i=0; i<height.length; i++){
			tallest = Math.max(tallest, height[i]);
		}
		return tallest;
	}
	
	// method to get mean height	
	public static double findMeanHeight(double []height){
		double mean = 0.0;
		double sum = findSum(height);
		mean = sum/height.length;
		return mean;
	}
	
	// method to get sum 
	public static double findSum(double []height){
		double sum= 0.0;
		for(int i=0; i<height.length; i++){
			sum += height[i];
		}
		return sum;
	}
}	