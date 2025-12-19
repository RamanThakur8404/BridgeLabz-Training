import java.util.*;
public class BMICalculator{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		// Taking user input
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        double[] weight = new double[number]; 
        double[] height = new double[number];
		double[] bmi = new double[number];
		String[] status = new String[number];
        for(int i=0;i<number;i++){
			System.out.println("Enter weight (kg) for person " + (i + 1));
            weight[i] = scanner.nextDouble();
            System.out.println("Enter height (meters) for person " + (i + 1));
            height[i] = scanner.nextDouble();
		}

        // calculate BMI
		for (int i =0;i<bmi.length;i++){
			 bmi[i]= weight[i]/(height[i]* height[i]);
			if(bmi[i] <= 18.4) {
				status[i] ="Underweight";
			}
			else if(bmi[i] >= 18.5 && bmi[i] <= 24.9) {
				status[i] ="Normal";
			}
			else if(bmi[i] >= 25.0 && bmi[i] <= 39.9) {
				status[i] ="Overweight";
			}
			else{
				status[i] ="Obese";
			}
		}
        // Printing the results and close scanner object
        for(int i=0;i<number;i++){
			System.out.println("weight of person "+(i+1) +" is " + weight[i]);
			System.out.println("height of person "+(i+1) +" is " + height[i]);
			System.out.println("BMI of person "+(i+1) +" is " + bmi[i]);
			System.out.println("status of person "+(i+1) +" is " + status[i]+"\n");
		}
        scanner.close();
	}
}