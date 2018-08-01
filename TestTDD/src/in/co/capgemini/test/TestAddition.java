//Test class for JUnit Testing of Addition method in Maths Class
package in.co.capgemini.test;

import org.junit.Assert;
import org.junit.Test;
import in.co.capgemini.calculator.Maths;

public class TestAddition {

	// Method to test Addition of 2 positive numbers
	@Test
	public void testPositiveAddition() {
		Maths math = new Maths();
		int answer = math.add(2, 3);
		Assert.assertEquals(5, answer);
	}

	// Method to test Addition of 2 negative numbers
	@Test
	public void testNegativeAddition() {
		Maths math = new Maths();
		int answer = math.add(-2, -3);
		Assert.assertEquals(-5, answer);
	}

	// Method to test Addition of 1 positive & 1 negative number
	@Test
	public void testOnePositiveOneNegativeAddition() {
		Maths math = new Maths();
		int answer = math.add(2, -3);
		Assert.assertEquals(-1, answer);
	}

	// Method to test Addition of a Zero number
	@Test
	public void testZeroAddition() {
		Maths math = new Maths();
		int answer = math.add(0, 0);
		Assert.assertEquals(0, answer);
	}
}
