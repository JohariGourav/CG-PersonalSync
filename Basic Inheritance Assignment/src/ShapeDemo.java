// class ShapeDemo with main() method to call draw() of different shapes
public class ShapeDemo {

	// main method
	public static void main(String[] args) {
		
		// Array of Objects
		Shape shape[] = new Shape[3];
		shape[0] = new Circle();
		shape[1] = new Rectangle();
		shape[2] = new Polygon();
		
		for(int i =0;i<3;i++) {
			shape[i].draw();
		}

	}

}
