package in.co.capgemini.test;

import static org.junit.Assert.*;

import org.junit.Test;

import in.co.capgemini.calculator.Maths;
import junit.framework.Assert;

public class TestDivision {

	@Test
	public void testPositiveDivision() {
		Maths math = new Maths();
		int answer = math.division(5, 2);
		Assert.assertEquals(2, answer);
	}
	
	@Test
	public void testBothNegativeDivision() {
		Maths math = new Maths();
		int answer = math.division(-5, -2);
		Assert.assertEquals(2, answer);
	}
	
	@Test
	public void testOneNegativeOnePostitiveDivision() {
		Maths math = new Maths();
		int answer = math.division(5, -2);
		Assert.assertEquals(-2, answer);
	}
	
	@Test
	public void testDivisorGreaterThanDividendDivision() {
		Maths math = new Maths();
		int answer = math.division(5, -10);
		Assert.assertEquals(0, answer);
	}
	
	@Test(expected = java.lang.Exception.class)
	public void testDivisorZeroDivision() {
		Maths math = new Maths();
		int answer = math.division(5, 0);
		//Assert.assertEquals(0, answer);
	}
}
