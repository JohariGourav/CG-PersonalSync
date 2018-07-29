//Test Class to understand Dynamic Polymorphism

package basicInheritanceAssignment;

public class TestTop1 {

	public static void main(String[] args) {

		Bottom1 bottom1 = new Bottom1();

		Bottom2 bottom2 = new Bottom2();

		Bottom3 bottom3 = new Bottom3();

		Top1 bottom = new Top1();

		bottom1.disp();

		bottom2.disp();
		bottom3.disp();
		bottom.disp();
	}

}
