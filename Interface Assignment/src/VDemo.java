//class VDemo with Objects of 3 different Wheeler classes
public class VDemo {

	// main method
	public static void main(String[] args) {

		Vehicle vehicle[] = new Vehicle[3];
		vehicle[0] = new TwoWheeler();
		vehicle[1] = new ThreeWheeler();
		vehicle[2] = new FourWheeler();
		System.out.println(vehicle[0]);
		System.out.println(vehicle[1]);
		System.out.println(vehicle[2]);
		
		// calling start() method only if there is class ThreeWheeler
		for (int i = 0; i < 3; i++) {
			if (vehicle[i].getClass().isInstance(new ThreeWheeler())) {
				vehicle[i].start();

			}
		}

	}
}
