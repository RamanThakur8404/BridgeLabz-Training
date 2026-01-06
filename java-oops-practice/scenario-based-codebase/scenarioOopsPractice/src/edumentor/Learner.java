package edumentor;

public class Learner extends User implements ICertifiable {
	private String courseType;
	boolean fullTime;
	public Learner(String name, String email, String courseType, int userId, boolean fullTime) {
		super(name,email,userId);
		this.courseType = courseType;
		this.fullTime = fullTime;
	}
	
	@Override
	public void printInfo() {
		System.out.println("Learner Name: " + super.getName());
		System.out.println("Learner Email: " + super.getEmail());
		System.out.println("Learner Id: " + super.getUserId());
	}

	@Override
	public String generateCertificate(double percentage) {
		
		if(percentage < 50) {
			return "Certificate not issued(less score to pass)";
		}
		
		if(courseType.equalsIgnoreCase("full-time")) {
			return "You have successfully completed full-time certification course";
		}
		else {
			return "You have successfully completed a certification of short course";
		}
	}
}
