/*
Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.
*/

import java.util.Scanner;
public class FitnessTracker{
	public static final int DAYS = 6;
	public static void main(String []args){
		Scanner read = new Scanner(System.in);
		int []fitCheck = new int[DAYS];
		for(int i=1; i<=fitCheck.length; i++){
			System.out.println("Enter count of push-ups on day " + i );
			fitCheck[i-1] = read.nextInt();
		}

		// applying the required logic
		int total = calculateTotalPushUps(fitCheck);
		double average = calculateAveragePushUps(fitCheck);
		
		
		// display the result
		System.out.println("The total count of push-ups is "+ total);
		System.out.println("The average count of push-ups is "+ average);
		
	}
	
	// method to calculate Total Push-ups
	public static int calculateTotalPushUps(int []fitCheck){
		int total = 0;

		for(int fit : fitCheck){
			if(fit == 0){
				continue;
			}
			total += fit;
		}	
		return total;
	}
	
	// method to calculate Average number of Push-Ups
	public static double calculateAveragePushUps(int []fitCheck){
		double routineDays = 0.0;
		for(int fit : fitCheck){
			if(fit == 0){
				continue;
			}
			else{
				routineDays++;
			}	
		}	
		return calculateTotalPushUps(fitCheck)/routineDays;
	}
}	