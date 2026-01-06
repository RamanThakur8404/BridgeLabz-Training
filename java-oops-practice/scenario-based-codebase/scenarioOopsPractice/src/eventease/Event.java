package eventease;

public abstract class Event implements ISchedulable {

    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private final int eventId;   // cannot be modified once assigned
    private double totalCost;    // encapsulated pricing

    // Constructor
    public Event(int eventId, String eventName, String location,String date, int attendees) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.totalCost = 0;
    }

    // Constructor WITH catering/decoration
    public Event(int eventId, String eventName, String location,String date, int attendees,double venueCost, double serviceCost, double discount) {
        this(eventId, eventName, location, date, attendees);
        this.totalCost = venueCost + serviceCost - discount; // operators
    }

    public final int getEventId() {
        return eventId;
    }

    public void showDetails() {
        System.out.println("Event ID: " + eventId);
        System.out.println("Event Name: " + eventName);
        System.out.println("Date: " + date);
        System.out.println("Location: " + location);
        System.out.println("Attendees: " + attendees);
        System.out.println("Total Cost: " + totalCost);
    }

    // Polymorphism
    public abstract void schedule();
}
