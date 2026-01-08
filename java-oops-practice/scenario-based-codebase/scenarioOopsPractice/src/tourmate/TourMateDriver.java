package tourmate;

import java.util.Scanner;

public class TourMateDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Trip Type:");
        System.out.println("1. Domestic");
        System.out.println("2. International");
        int choice = sc.nextInt();

        System.out.print("Enter Destination: ");
        String destination = sc.next();

        System.out.print("Enter Duration (days): ");
        int days = sc.nextInt();

        System.out.print("Enter Transport Cost: ");
        double transportCost = sc.nextDouble();

        System.out.print("Enter Hotel Cost per Day: ");
        double hotelCost = sc.nextDouble();

        System.out.print("Enter Activity Cost: ");
        double activityCost = sc.nextDouble();

        Transport transport = new Transport(transportCost);
        Hotel hotel = new Hotel(hotelCost, days);
        Activity activity = new Activity(activityCost);

        Trip trip;

        if (choice == 1) {
            trip = new DomesticTrip(destination, days, transport, hotel, activity);
        } else {
            trip = new InternationalTrip(destination, days, transport, hotel, activity);
        }

        trip.book();
        sc.close();
    }
}
