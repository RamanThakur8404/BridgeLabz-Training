import java.util.Scanner;
public class MetroSmartCard {
    public static void main(String[] args) {
		//take user input
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your balance: ");
        int balance = scanner.nextInt();

		//applying the logic
        while (balance > 0) {
            System.out.print("Enter distance (0 to exit): ");
            int distance = scanner.nextInt();

            if (distance == 0){
				break;
			}
			
            int fare = (distance <= 5) ? 20 : 30;

            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare price: " + fare);
                System.out.println("Remaining balance: " + balance);
            }
			else {
                System.out.println("Insufficient balance left");
                break;
            }
        }
		
		// print the result
        System.out.println("Journey ended. Final balance: " + balance);
        scanner.close();
    }
}
