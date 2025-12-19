import java.util.Scanner;
public class MeanHeightFootballPlayer {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		double height[] = new double[11];
		double totalSum = 0.0;
		double numberOfPlayer = 0.0;
		double mean;
		
		// find totalsum and mean 
		System.out.println("Enter the height of the team player: "); 
		for(int i=0;i<height.length;i++){
			height[i] = scanner.nextDouble();
			totalSum += height[i];
			numberOfPlayer++;
		}		
		mean = totalSum / numberOfPlayer;
		
		//print the height, close scanner
		System.out.println(" The mean height of football team "+mean);
	}
}	