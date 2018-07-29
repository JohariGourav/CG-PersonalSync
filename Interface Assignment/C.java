//Class C implements interface A and B, having method disp and disp2
package interfaceAssignment;

public class C implements InterfaceB {

	// method from interface A
	@Override
	public void disp() {
		System.out.println("abstract method of interface A");
	}

	// method from interface B
	@Override
	public void disp2() {
		System.out.println("abstract method of interface B");
	}

	// main method to call display method using object c
	public static void main(String arge[]) {

		C c = new C();
		c.disp();
		c.disp2();
	}
}
