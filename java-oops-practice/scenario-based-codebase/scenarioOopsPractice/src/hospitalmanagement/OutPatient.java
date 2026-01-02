package hospitalmanagement;

public class OutPatient extends Patient {
    private String visitDate;

    public OutPatient(int id, String name, String visitDate) {
        super(id, name);
        this.visitDate = visitDate;
    }

    @Override
    public void displayInfo() {
        System.out.println(getSummary() + "\nVisit Date: " + visitDate);
    }
}
