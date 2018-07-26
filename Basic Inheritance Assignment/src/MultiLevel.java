//example of Multi level inheritance ( 3 classes - GrandFather, Father , Son
//GrandFather class
class GrandFather {
	private int k;

	// Arg ctor
	public GrandFather(int k) {
		System.out.println("GrandParent ctor created");
		this.k = k;
	}

	// NO arg ctor
	public GrandFather() {
		super();
	}

	// method to display 'i'
	void disp() {
		System.out.println("called" + k);
	}

}

//Father class inheriting GrandFather
class Father extends GrandFather{
	private int i;

	// Arg ctor
		public Father(int k, int i) {
			super(k);
			this.i = i;
			System.out.println("Father ctor created");
		}


	// NO arg ctor
	public Father() {
		super();
	}

	// method to display 'i'
	void disp() {
		System.out.println("called" + i);
	}

}

//Son class inheriting Father
class Son extends Father {
	private int j;

	// no arg ctor
	public Son() {
		super();
	}

	// arg ctor
	public Son(int k, int i,int j) {
		super(k,i);
		this.j = j;
		System.out.println("Son ctor created");
	}

	// method to display 'j'
	void disp() {

		System.out.println(j);
	}

}

//TestClass MultiLevel
public class MultiLevel {
	// main method
	public static void main(String[] args) {

		Son child = new Son(10, 20,30);
		Father boy = new Son(40, 50,60);
		GrandFather woman = new Son(70,80,90);
		
		child.disp();
		boy.disp();
		woman.disp();
	}

}
