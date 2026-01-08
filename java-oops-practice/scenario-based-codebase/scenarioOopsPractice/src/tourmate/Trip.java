package tourmate;

public abstract class Trip implements IBookable {

    private String destination;
    private int duration;
    protected double budget;

    protected Transport transport;
    protected Hotel hotel;
    protected Activity activity;

    // Constructor generates complete trip package
    public Trip(String destination, int duration,
                Transport transport, Hotel hotel, Activity activity) {

        this.destination = destination;
        this.duration = duration;
        this.transport = transport;
        this.hotel = hotel;
        this.activity = activity;

        calculateTotalBudget();
    }

    // Operator usage
    private void calculateTotalBudget() {
        budget = transport.getCost()
               + hotel.getCost()
               + activity.getCost();
    }

    public void showTripDetails() {
        System.out.println("Destination: " + destination);
        System.out.println("Duration: " + duration + " days");
        System.out.println("Total Budget: " + budget);
    }
}
