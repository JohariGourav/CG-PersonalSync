//example of single level inheritance
//parent class
class Parent {
	private int i;

	// Arg ctor
	public Parent(int i) {
		System.out.println("Parent ctor created");
		this.i = i;
	}

	// NO arg ctor
	public Parent() {
		super();
	}

	// method to display 'i'
	void disp() {
		System.out.println("called" + i);
	}

}

//child class inheriting parent
class Child extends Parent {
	private int j;

	// no arg ctor
	public Child() {
		super();
	}

	// arg ctor
	public Child(int i, int j) {
		super(i);
		this.j = j;
		System.out.println("child ctor created");
	}

	// method to display 'j'
	@Override               //overriding disp() of Parent
	void disp() {

		System.out.println(j);
	}

}

//TestClass SingleLevel
public class SingleLevel {
	// main method
	public static void main(String[] args) {

		Child child = new Child(10, 20);
		Parent boy = new Child(20, 10);
		
		child.disp();
		boy.disp();
	}

}
