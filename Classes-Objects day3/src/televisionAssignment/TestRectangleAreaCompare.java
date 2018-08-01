package televisionAssignment;

import java.awt.Rectangle;
import java.util.*;

public class TestRectangleAreaCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleAreaCompare rectangle = new RectangleAreaCompare();
		RectangleAreaCompare rectangle_2 = new RectangleAreaCompare();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length and breadth of 1st rectangle");
		double length = scanner.nextDouble();
		double breadth = scanner.nextDouble();
		
		rectangle.setLength(length);
		rectangle.setBreadth(breadth);
		
		System.out.println("Enter length and breadth of 2nd rectangle");
		double length2 = scanner.nextDouble();
		double breadth2 = scanner.nextDouble();
		
		rectangle_2.setLength(length2);
		rectangle_2.setBreadth(breadth2);
		
		if(rectangle.getLength() != rectangle_2.getLength() || rectangle.getBreadth() != rectangle_2.getBreadth()) {
			if(rectangle.area() == rectangle_2.area()) {
			System.out.println("Area of 2 rectangles is equal : "+rectangle.area());
		}
			else
				System.out.println("Area of 2 rectangles is  not equal : "+rectangle.area() +" "+rectangle_2.area());
		
	}

}
}
