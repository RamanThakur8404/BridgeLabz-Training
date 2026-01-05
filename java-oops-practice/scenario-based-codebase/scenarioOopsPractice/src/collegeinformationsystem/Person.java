package collegeinformationsystem;

public abstract class Person {
	private String name;
	private String email;
	private int id;
	
	abstract void printDetails();
	
	public Person(String name, String email, int id) {
		this.setName(name);
		this.setEmail(email);
		this.setId(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
