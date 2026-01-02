package hospitalmanagement;

public class InPatient extends Patient {
    private int daysAdmitted;

    public InPatient(int id, String name, String history, int days) {
        super(id, name, history);
        this.daysAdmitted = days;
    }

    @Override
    public void displayInfo() {
        System.out.println(getSummary() + "\nDays Admitted: " + daysAdmitted);
    }
}
