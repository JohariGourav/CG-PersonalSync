//Test class for JUnit Testing of Division method in Maths Class
package in.co.capgemini.test;

import org.junit.Assert;
import org.junit.Test;

import in.co.capgemini.calculator.Maths;

public class TestDivision {

	// Method to test Division of 2 positive numbers
	@Test
	public void testPositiveDivision() {
		Maths math = new Maths();
		int answer = math.division(5, 2);
		Assert.assertEquals(2, answer);
	}

	// Method to test Division of 2 negative numbers
	@Test
	public void testBothNegativeDivision() {
		Maths math = new Maths();
		int answer = math.division(-5, -2);
		Assert.assertEquals(2, answer);
	}

	// Method to test Division of 1 positive & 1 negative number
	@Test
	public void testOneNegativeOnePostitiveDivision() {
		Maths math = new Maths();
		int answer = math.division(5, -2);
		Assert.assertEquals(-2, answer);
	}

	// Method to test Division of a number smaller than Divisor
	@Test
	public void testDivisorGreaterThanDividendDivision() {
		Maths math = new Maths();
		int answer = math.division(5, -10);
		Assert.assertEquals(0, answer);
	}

	// Method to test Division of a Zero number
	@Test(expected = java.lang.Exception.class)
	public void testDivisorZeroDivision() {
		Maths math = new Maths();
		int answer = math.division(5, 0);
		// Assert.assertEquals(0, answer);
	}
}
