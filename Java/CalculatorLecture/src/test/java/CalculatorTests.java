import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTests {

	Calculator calc = new CalculatorImpl();
	
	@Test
	public void testAdd() {
		assertEquals(5, calc.add(2, 3));
	}
	
	@Test
	public void testSubtract() {
		assertEquals(1, calc.subtract(3, 2));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(6, calc.multiply(2, 3));
	}
	
	@Test
	public void testDivide() {
		assertEquals(3, calc.divide(6, 2));
	}
	
	@Test
	public void testModulo() {
		assertEquals(1, calc.modulo(10, 9));
	}
	
	@Test
	public void testCalculate() {
		assertEquals(10, calc.calculate("5 + 5"));
	}
}
