package edumentor;

public class Instructor extends User implements ICertifiable{
	private String expertise;
	
	public Instructor(String name, String email, int instructorId, String expertise) {
		super(name,email,instructorId);
		this.expertise = expertise;
	}
	
	public String getExpertise() {
		return expertise;
	}
	
	@Override
	public void printInfo() {
		System.out.println("Instructor name: " + super.getName());
		System.out.println("Instructor email: " + super.getEmail());
		System.out.println("Instructor id: " + super.getUserId());
		System.out.println("Expertise: " + expertise);
	}
	
	@Override
	public String generateCertificate(double percentage) {
		return "Instructor Teaching Certificate - " + getExpertise();
	}
}
