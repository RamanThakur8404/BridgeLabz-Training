package parkease;
import java.util.Scanner;

public class ParkEaseApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        ParkingSlot slot = new ParkingSlot(101, "All");
        System.out.println("Wecome to parking system:");
        while (choice != 0) {

            System.out.println("\n--- ParkEase Menu ---");
            System.out.println("1. Park Car");
            System.out.println("2. Park Bike");
            System.out.println("3. Park Truck");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting ParkEase. Thank you!");
                break;
            }

            if (!slot.isAvailable()) {
                System.out.println("Parking Slot is already occupied.");
                continue;
            }

            System.out.print("Enter Vehicle Number: ");
            String vehicleNumber = sc.next();

            System.out.print("Enter Parking Duration (hours): ");
            int hours = sc.nextInt();

            Vehicle vehicle = null;

            switch (choice) {
                case 1:
                    vehicle = new Car(vehicleNumber);
                    break;
                case 2:
                    vehicle = new Bike(vehicleNumber);
                    break;
                case 3:
                    vehicle = new Truck(vehicleNumber);
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            slot.bookSlot(vehicleNumber);
            double charges = vehicle.calculateCharges(hours);

            System.out.println("Parking Charges: ₹" + charges);
            System.out.println("Log: " + slot.getBookingLog());

            slot.releaseSlot();
        }

        sc.close();
    }
}
