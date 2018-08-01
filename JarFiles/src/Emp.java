//class Emp (employee)  for jar File creation used for TestEmployee.java at other location
public class Emp {

	private int empId;
	private int salary;
	private String empName;

	// arg ctor...
	public Emp(int empId, String empName, int salary) {

		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	// method to display contents
	public void disp() {
		System.out.println("empId: " + empId + ", empName: " + empName + ", salary: " + salary);
	}

}
