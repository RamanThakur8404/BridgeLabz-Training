import java.util.Scanner;
public class BusRouteDistanceTracker{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		
		double totalDistanceCovered = 0.0;
		int stopNumber = 1;
		char getOff = 'N';
		
		System.out.println("Bus Route Distance Tracker Started ");
		
		while(getOff != 'Y'){
			System.out.println("Enter distance travelled to stop "+ stopNumber +" (in KM): ");
			double distance = scanner.nextDouble();
			
			totalDistanceCovered += distance;
			System.out.println("Total distance travelled so far: " + totalDistanceCovered + " km");
            System.out.print("Do you want to get off at this stop? (Y/N): ");
            getOff = scanner.next().toUpperCase().charAt(0);

            stopNumber++;
        }
		
		System.out.println("Passenger got off");
		System.out.println("Final distance travelled " + totalDistanceCovered + "km");
		
		scanner.close();
	}
}	
			