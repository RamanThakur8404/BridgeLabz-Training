import java.util.Scanner;
public class BMICalculator{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		double [][]personData = new double[10][2];
		for(int i=0;i<personData.length;i++){
			System.out.println("Enter weight of person" + (i+1));
			personData[i][0] = scanner.nextDouble();
			System.out.println("Enter height of person " + +(i+1));
			personData[i][1] = scanner.nextDouble();
		}
		
		// applying logic
		String [][]bmiStatus = findBMIAndStatus(personData);
		
		// call display method
		displayTable(bmiStatus);
		scanner.close();
	}
	
	// method to find BMI and status of person
	public static String [][]findBMIAndStatus(double [][]personData){
		double bmi = 0.0;
		String [][]bmiStatus = new String[personData.length][4];
		for(int i=0;i<personData.length;i++){
			double heightInMeter = personData[i][1] * 0.01;
			bmiStatus[i][0] = String.valueOf(heightInMeter);
			bmiStatus[i][1] = String.valueOf(personData[i][0]);
			bmi = personData[i][0] / Math.pow(heightInMeter,2);
			bmiStatus[i][2] = String.valueOf(bmi);
			if(bmi <= 18.4){
				bmiStatus[i][3] = "Underweight";
			}
			else if(bmi <= 24.9){
				bmiStatus[i][3] = "Normal";
			}
			else if(bmi <= 39.9){
				bmiStatus[i][3] = "Overweight";
			}
			else{
				bmiStatus[i][3] = "Obese";
			}	
		}
		return bmiStatus;
	}
	
	// display the answer in table format
	public static void displayTable(String[][] store){
		System.out.println("\nNo.\tHeight\t\t\tWeight\t\t\tBMI\t\t\tStatus");
		for(int i=0;i<store.length;i++){
			System.out.println((i+1)+"\t"+store[i][0]+"\t\t\t"+store[i][1]+"\t\t"+store[i][2]+"\t\t"+store[i][3]);
		}
	}
}	