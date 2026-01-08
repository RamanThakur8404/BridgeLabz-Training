package tourmate;

public class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,
                             Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    @Override
    public void book() {
        System.out.println("International trip booked with passport & visa check!");
        showTripDetails();
    }

    @Override
    public void cancel() {
        System.out.println("International trip cancelled (refund may take time).");
    }
}
