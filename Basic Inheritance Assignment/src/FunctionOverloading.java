//example of FunctionOverloading ( disp() method of child is overloading)
//parent class
class Parent1 {
	private int i;

	// Arg ctor
	public Parent1(int i) {
		System.out.println("Parent1 ctor created");
		this.i = i;
	}

	void disp(int j) {
		// TODO Auto-generated method stub
		
	}

	// NO arg ctor
	public Parent1() {
		super();
	}

	// method to display 'i'
	void disp(float j) {
		System.out.println("called" + i);
	}

	public int getI() {
		return i;
	}

	

}

//child class inheriting parent
class Child1 extends Parent1 {
	private int j;

	// no arg ctor
	public Child1() {
		super();
	}

	// arg ctor
	public Child1(int i, int j) {
		super(i);
		this.j = j;
		System.out.println("child ctor created");
	}

	// method to display 'j'
	@Override               //overriding disp() of Parent1
	void disp(int j) {

		System.out.println("i from parent1: " +getI()+" j from child1: "+j);
		
	}
	void disp(int j, int i) {

		System.out.println("i from parent1: " +getI()+" j from child1: "+j);
		
	}

}

//TestClass FunctionOverloading
public class FunctionOverloading {

	// main method
		public static void main(String[] args) {

			Child1 child = new Child1(10, 20);
			Parent1 boy = new Child1(20, 10);
			
			child.disp(50,20);
			boy.disp(50);
		}

}
