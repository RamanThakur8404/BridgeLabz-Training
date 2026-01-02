package hospitalmanagement;

public class HospitalSystem {
    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Ravi", "Diabetes", 5);
        Patient p2 = new OutPatient(102, "Anita", "12-01-2026");

        Doctor d1 = new Doctor(201, "Dr. Sharma", "Cardiology");
        Doctor d2 = new Doctor(202, "Dr. Modi", "Eye Specialist");
        Bill bill = new Bill(10000, 0.18, 500);
        
        
        p1.displayInfo();
        d1.displayInfo();
        System.out.println();
        
        p2.displayInfo();
        d2.displayInfo();
        System.out.println("Total Bill Amount: ₹" + bill.calculatePayment());
    }
}
