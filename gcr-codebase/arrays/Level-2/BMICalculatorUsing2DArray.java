import java.util.*;
public class BMICalculatorUsing2DArray{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		// Taking user input
        System.out.println("Enter the number the persons : ");
        int number = scanner.nextInt();
        double[][] personData  = new double[number][3]; 
		String[] weightStatus = new String[number];
        for(int i=0;i<number;i++){
			System.out.println("Enter weight (kg) for person " + (i + 1));
            personData[i][0] = scanner.nextDouble();
            System.out.println("Enter height (meters) for person " + (i + 1));
            personData[i][1] = scanner.nextDouble();
			if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--; 
            }
		}

        // calculate BMI
		for (int i =0;i<number;i++){
			personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
			 double bmi = personData[i][2];
			if(bmi <= 18.4) {
				weightStatus[i] ="Underweight";
			}
			else if(bmi >= 18.5 && bmi <= 24.9) {
				weightStatus[i] ="Normal";
			}
			else if(bmi >= 25.0 && bmi <= 39.9) {
				weightStatus[i] ="Overweight";
			}
			else{
				weightStatus[i] ="Obese";
			}
		}
        // Printing the results and close scanner object
        for(int i = 0 ; i < number ; i++ ){
		      System.out.println("person " + (i+1));
			    System.out.println("weight = " + personData[i][0]);
			    System.out.println("height = " + personData[i][1]);
			    System.out.println("BMI = " + personData[i][2]+"\n");
				}
        scanner.close();
	}
}
