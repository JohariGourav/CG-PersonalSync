//example of Hierarchical inheritance ( 3 classes - Big, Small1 , Small2
//Big class
class Big {
	private int k;

	// Arg ctor
	public Big(int k) {
		System.out.println("GrandParent ctor created");
		this.k = k;
	}

	// NO arg ctor
	public Big() {
		super();
	}

	// method to display 'i'
	void disp() {
		System.out.println("called" + k);
	}

}

//Small1 class extending Big
class Small1 extends Big{
	private int i;

	// Arg ctor
		public Small1(int k, int i) {
			super(k);
			this.i = i;
			System.out.println("Small1 ctor created");
		}


	// NO arg ctor
	public Small1() {
		super();
	}

	// method to display 'i'
	void disp() {
		System.out.println("called" + i);
	}

}

//Small2 class inheriting Big
class Small2 extends Big {
	private int j;

	// no arg ctor
	public Small2() {
		super();
	}

	// arg ctor
	public Small2(int i,int j) {
		super(i);
		this.j = j;
		System.out.println("Small2 ctor created");
	}

	// method to display 'j'
	void disp() {

		System.out.println(j);
	}

}
//TestClass Hierarchical
public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Small2 child = new Small2(10, 20);
		Big boy = new Small2(40,50);
		Big woman = new Small2(70,80);
		
		child.disp();
		boy.disp();
		woman.disp();
	}

}
