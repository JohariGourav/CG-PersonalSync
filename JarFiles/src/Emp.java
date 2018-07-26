// Employee Class
public class Emp {
	
	private int empId;
	private int salary;
	private String empName;
	
	public Emp ( int empId, String empName, int salary) {
		
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	
	public void disp() {
		System.out.println("empId: " + empId + ", empName: " + empName+ ", salary: " + salary ); 
	}
	
	
}
