import java.util.Scanner;
// Create a class DistanceConversion that convert the distance in yards and miles.
public class DistanceConversion {
  public static void main(String[] args) {
        //declare variables as distanceInFeet and take user input
        double distanceInFeet;        
        Scanner input = new Scanner(System.in); 
        distanceInFeet = input.nextDouble(); 
        
		//converting feet to yards,and converting yards to miles
        double yards = distanceInFeet / 3;      
        double miles = yards / 1760;          
		
		 //Display the result
        System.out.println("The distance in yards is " + yards +" and in miles is " + miles);
		//close the Scanner object
		input.close();
    }
}