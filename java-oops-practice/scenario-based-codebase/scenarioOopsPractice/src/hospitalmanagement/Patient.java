package hospitalmanagement;

public class Patient {
	private int patientId;
	private String name;
	private String medicalHistory;
	
	public Patient(int patientId, String name) {
		this.patientId = patientId;
		this.name = name;
		this.medicalHistory = "not provided";
	}
	
	public Patient(int patientId, String name,String medicalHistory) {
		this(patientId,name);
		this.medicalHistory = medicalHistory;
	}
	
	 public String getSummary() {
	        return "Patient ID: " + patientId + "\nName: " + name;
	    }

	    public void displayInfo() {
	        System.out.println(getSummary());
	    }
	
}
