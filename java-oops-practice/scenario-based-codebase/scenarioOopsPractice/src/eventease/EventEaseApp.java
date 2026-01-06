package eventease;
import java.util.Scanner;

public class EventEaseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to EventEase");

        System.out.print("Organizer Name: ");
        String userName = sc.nextLine();

        System.out.print("Organizer Email: ");
        String email = sc.nextLine();

        System.out.print("Organizer Number: ");
        String number = sc.nextLine();
        User user = new User(userName, email, number);

        System.out.print("Event Type (Birthday / Conference): ");
        String type = sc.nextLine();

        System.out.print("Event ID: ");
        int eventId = sc.nextInt();
        sc.nextLine();

        System.out.print("Event Name: ");
        String eventName = sc.nextLine();

        System.out.print("Location: ");
        String location = sc.nextLine();

        System.out.print("Date: ");
        String date = sc.nextLine();

        System.out.print("Number of Attendees: ");
        int attendees = sc.nextInt();

        System.out.print("Venue Cost: ");
        double venueCost = sc.nextDouble();

        System.out.print("Service Cost: ");
        double serviceCost = sc.nextDouble();

        System.out.print("Discount: ");
        double discount = sc.nextDouble();

        Event event;

        if (type.equalsIgnoreCase("Birthday")) {
            event = new BirthdayEvent(eventId, eventName, location,date, attendees, venueCost, serviceCost, discount);
        } 
        else {
            event = new ConferenceEvent(eventId, eventName, location,date, attendees, venueCost, serviceCost, discount);
        }

        System.out.println();
        event.schedule();
        event.showDetails();

        sc.close();
    }
}
