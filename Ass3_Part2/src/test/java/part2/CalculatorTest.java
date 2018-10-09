package part2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	int x, y;
	Calculator calc;
	
	@Before
	public void setUp() throws Exception {
		x = 10;
		y = 5;
		calc = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		calc = null;
	}

	@Test
	public void testAdd() {
		assertEquals(x + y, calc.add(x, y));
	}

	@Test
	public void testSubtract() {
		assertEquals(x - y, calc.subtract(x, y));
	}

	@Test
	public void testDivide() {
		assertEquals(x / y, calc.divide(x, y));
	}

	@Test
	public void testMultiply() {
		assertEquals(x * y, calc.multiply(x, y));
	}
}