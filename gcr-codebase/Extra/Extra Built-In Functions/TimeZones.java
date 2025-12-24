import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZones {
    public static void main(String[] args) {
        // Get the current time in different time zones
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime indianTime= ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime americaTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        // Display the times in a readable format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        System.out.println("Current Time in GMT: " + gmtTime.format(formatter));
        System.out.println("Current Time in IST: " + indianTime.format(formatter));
        System.out.println("Current Time in PST: " + americaTime.format(formatter));
    }
}
