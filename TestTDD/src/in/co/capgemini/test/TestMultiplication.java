package in.co.capgemini.test;

import static org.junit.Assert.*;

import org.junit.Test;

import in.co.capgemini.calculator.Maths;
import junit.framework.Assert;

public class TestMultiplication {

	@Test
	public void testPositiveMultiplication() {
		Maths math = new Maths();
		int answer = math.multiply(5, 2);
		Assert.assertEquals(10, answer);
	}
	
	@Test
	public void testBothNegativeMultiplication() {
		Maths math = new Maths();
		int answer = math.multiply(-5, -2);
		Assert.assertEquals(10, answer);
	}
	
	@Test
	public void testOneNegativeOnePostitiveMultiplication() {
		Maths math = new Maths();
		int answer = math.multiply(-5, 2);
		Assert.assertEquals(-10, answer);
	}

	@Test
	public void testZeroMultiplication() {
		Maths math = new Maths();
		int answer = math.multiply(-5, 0);
		Assert.assertEquals(0, answer);
	}
}
