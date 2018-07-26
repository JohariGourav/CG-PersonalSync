package in.co.capgemini.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import in.co.capgemini.calculator.Maths;

public class TestSubtraction {

	@Test
	public void testPositiveSubtraction() {
		Maths math = new Maths();
		int answer = math.subtract(5,2);
		Assert.assertEquals(3, answer);
	}
	
	@Test
	public void testNegativeSubtraction() {
		Maths math = new Maths();
		int answer = math.subtract(-5,-2);
		Assert.assertEquals(-3, answer);
	}
	
	@Test
	public void testOnePositiveOneNegativeSubtraction() {
		Maths math = new Maths();
		int answer = math.subtract(5,-2);
		Assert.assertEquals(7, answer);
	}
	
	@Test
	public void testZeroSubtraction() {
		Maths math = new Maths();
		int answer = math.subtract(-5,0);
		Assert.assertEquals(-5, answer);
	}
}
