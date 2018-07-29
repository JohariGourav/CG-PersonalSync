//Test class for JUnit Testing of Multiplication method in Maths Class
package in.co.capgemini.test;

import org.junit.Assert;

import org.junit.Test;

import in.co.capgemini.calculator.Maths;

public class TestMultiplication {

	// Method to test Multiplication of 2 positive numbers
	@Test
	public void testPositiveMultiplication() {
		Maths math = new Maths();
		int answer = math.multiply(5, 2);
		Assert.assertEquals(10, answer);
	}

	// Method to test Multiplication of 2 negative numbers
	@Test
	public void testBothNegativeMultiplication() {
		Maths math = new Maths();
		int answer = math.multiply(-5, -2);
		Assert.assertEquals(10, answer);
	}

	// Method to test Multiplication of 1 positive & 1 negative number
	@Test
	public void testOneNegativeOnePostitiveMultiplication() {
		Maths math = new Maths();
		int answer = math.multiply(-5, 2);
		Assert.assertEquals(-10, answer);
	}

	// Method to test Multiplication of a Zero number
	@Test
	public void testZeroMultiplication() {
		Maths math = new Maths();
		int answer = math.multiply(-5, 0);
		Assert.assertEquals(0, answer);
	}
}
