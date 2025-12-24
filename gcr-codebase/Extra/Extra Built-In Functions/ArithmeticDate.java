import java.time.LocalDate;
public class ArithmeticDate {
    public static void main(String[] args) {
        // Example input date
        LocalDate date = LocalDate.of(2023, 12, 24);
        System.out.println("Original Date: " + date);

        //add 7 days, 1 month, and 2 years
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1) .plusYears(2);

        // substract 3 weeks
        modifiedDate = modifiedDate.minusWeeks(3);

        System.out.println("Modified Date: " + modifiedDate);
    }
}
