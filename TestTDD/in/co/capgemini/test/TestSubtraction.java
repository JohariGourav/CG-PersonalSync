//Test class for JUnit Testing of Subtraction method in Maths Class
package in.co.capgemini.test;

import org.junit.Assert;

import org.junit.Test;

import in.co.capgemini.calculator.Maths;

public class TestSubtraction {

	// Method to test subtraction of 2 positive numbers
	@Test
	public void testPositiveSubtraction() {
		Maths math = new Maths();
		int answer = math.subtract(5, 2);
		Assert.assertEquals(3, answer);
	}

	// Method to test subtraction of 2 negative numbers
	@Test
	public void testNegativeSubtraction() {
		Maths math = new Maths();
		int answer = math.subtract(-5, -2);
		Assert.assertEquals(-3, answer);
	}

	// Method to test subtraction of 1 positive & 1 negative number
	@Test
	public void testOnePositiveOneNegativeSubtraction() {
		Maths math = new Maths();
		int answer = math.subtract(5, -2);
		Assert.assertEquals(7, answer);
	}

	// Method to test subtraction of a Zero number
	@Test
	public void testZeroSubtraction() {
		Maths math = new Maths();
		int answer = math.subtract(-5, 0);
		Assert.assertEquals(-5, answer);
	}
}
