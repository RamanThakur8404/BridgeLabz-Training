import java.time.LocalTime;
public class DigitalWatchSimulation {
    public static void main(String[] args) {

        System.out.println(" Digital Watch Simulation ");
        // Start time at 00:00
        LocalTime time = LocalTime.MIDNIGHT;

        // 24-hour watch simulation
        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {

                time = LocalTime.of(hour, minute);
                System.out.println(time);

                // Simulate power cut at 13:00
                if (hour == 13 && minute == 0) {
                    System.out.println("Power cut at 13:00");
                    return; 
                }
            }
        }
    }
}
