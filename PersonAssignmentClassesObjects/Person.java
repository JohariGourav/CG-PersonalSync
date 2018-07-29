import java.time.LocalDate;
import java.util.Date;

public class Person {
	
	private String name;
	private int day, month, year;
	private LocalDate dob = new LocalDate();
	
	//Arg Ctor to initialise Person Object 
	public Person(String name, int day, int month , int year) {
		super();
		this.name = name;
		this.day = day;
		this.month = month;
		this.year = year;
		this.dob = LocalDate.of(year, month, day);
	}
	
	public  void disp() {
		System.out.println ("Name: " + name + " Date of birth: " + dob);
	}
	
	public void olderPerson(Person person) {
		
	}
	
	
}
