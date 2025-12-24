import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateFormatting {
    public static void main(String[] args) {
        // Get the current date
        LocalDate date = LocalDate.now();

        // Define custom date formats
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Print the date in different formats
        System.out.println("Date in dd/MM/yyyy format: " + date.format(format1));
        System.out.println("Date in yyyy-MM-dd format: " + date.format(format2));
        System.out.println("Date in EEE, MMM dd, yyyy format: " + date.format(format3));
    }
}
