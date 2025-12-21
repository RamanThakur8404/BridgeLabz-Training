import java.util.*;
public class BMI2DArray{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		// Taking user input
		int member = 10;
		int column = 3;
        double[][] personData  = new double[member][column]; 
        
		for(int i=0;i<member;i++){
			System.out.println("Enter details of member " + (i + 1));
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
		calculateBMI(personData);
		String []bmiStatus  = BMIStatus(personData);
        // Printing the results and close scanner object
        for(int i = 0 ; i < member ; i++ ){
		      System.out.println("person " + (i+1));
			    System.out.println("weight = " + personData[i][0]);
			    System.out.println("height = " + personData[i][1]);
			    System.out.println("BMI = " + personData[i][2]);
			    System.out.println("Status = " + bmiStatus[i]+"\n");
		}
        scanner.close();
	}
	
	// calculate the BMI of each person
	public static void calculateBMI(int [][]personData){
		for (int i =0; i<member; i++){
			personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
		}
	}
	// check for BMIStatus
	public static String[] BMIStatus(double[][] personData){
	String[] weightData = new String[10];
	for(int i=0;i<10;i++){
		if(personData[i][2]<=18.4){
			weightData[i] = "Underweight";
		}
		else if(personData[i][2]>=18.5 && personData[i][2]<=24.9){
			weightData[i] = "Normal";
		}
		else if(personData[i][2]>=25 && personData[i][2]<=39.9){
			weightData[i] = "Overweight";
		}
		else{
			weightData[i] = "Obese";
		}
	}
	return weightData;
}