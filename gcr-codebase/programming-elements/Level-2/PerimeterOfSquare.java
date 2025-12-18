// Program to find side of a square using perimeter
import java.util.Scanner;
public class PerimeterOfSquare {  
    public static void main(String[] args) {
        //declare variables, and create scanner object 
        double perimeter; 
        Scanner input = new Scanner(System.in);
        perimeter = input.nextDouble();
       
		//calculating side of square
        double side = perimeter / 4; 
        
		//Display the result
        System.out.println("The length of the side is " + side +" whose perimeter is " + perimeter); 
		//close the scanner object
		input.close();
	}
}
