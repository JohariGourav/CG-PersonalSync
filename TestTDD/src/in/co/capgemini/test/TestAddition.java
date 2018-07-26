package in.co.capgemini.test;
import org.junit.Assert;
import org.junit.Test;
import in.co.capgemini.calculator.Maths;


public class TestAddition {
	
	@Test
	public void testPositiveAddition() {
		Maths math = new Maths();
		int answer = math.add(2,3);
		Assert.assertEquals(5, answer);
	}
	
	@Test
	public void testNegativeAddition() {
		Maths math = new Maths();
		int answer = math.add(-2,-3);
		Assert.assertEquals(-5, answer);
	}
	
	@Test
	public void testOnePositiveOneNegativeAddition() {
		Maths math = new Maths();
		int answer = math.add(2,-3);
		Assert.assertEquals(-1, answer);
	}
	
	@Test
	public void testBothZeroAddition() {
		Maths math = new Maths();
		int answer = math.add(0,0);
		Assert.assertEquals(0, answer);
	}
}
