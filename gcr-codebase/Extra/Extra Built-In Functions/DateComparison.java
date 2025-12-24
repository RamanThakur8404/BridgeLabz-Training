import java.time.LocalDate;

public class DateComparison {
    public static void main(String[] args) {
        // Example input dates
        LocalDate date1 = LocalDate.of(2023, 12, 24);
        LocalDate date2 = LocalDate.of(2024, 1, 1);

        // Compare the two dates
        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is before " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is after " + date2);
        } else if (date1.isEqual(date2)) {
            System.out.println(date1 + " is the same as " + date2);
        }
    }
}
