package collegeinformationsystem;

public class Faculty extends Person{
	private int departmentId;
	private String department;
	
	public Faculty(String name, String email, int id,int departmentId, String department) {
		super(name,email,id);
		this.department = department;
		this.setDepartmentId(departmentId);
	}
	
	@Override
	public void printDetails() {
		System.out.println("Faculty id: " + getId());
		System.out.println("Faculty name: " + getName());
		System.out.println("Faculty email: " + getEmail());
		System.out.println("Department: " + department);
		System.out.println("Department id: " + getDepartmentId());
		
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
}
