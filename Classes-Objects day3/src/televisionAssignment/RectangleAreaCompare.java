package televisionAssignment;

public class RectangleAreaCompare {

	private double length, breadth;

	public RectangleAreaCompare(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public RectangleAreaCompare() {
		this(1, 1);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public double area() {

		double area = 0;
		area = length * breadth;

		return area;
	}

}
