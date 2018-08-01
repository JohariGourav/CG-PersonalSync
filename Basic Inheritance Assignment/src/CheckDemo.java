//demo class to call variables directly & indirectly
public class CheckDemo {

	// main method
	public static void main(String[] args) {

		int chk1, chk2, chk3, chk4;
		Check check = new Check();
		check.disp();

		chk1 = check.defaultNum;

		// can't access private member directly
		// chk2 = check.privNum;
		chk3 = check.pubNum;
		chk4 = check.protNum;
		System.out.println(chk1 + " " + chk3 + " " + chk4);
	}

}
