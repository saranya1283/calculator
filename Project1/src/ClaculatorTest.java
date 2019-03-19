import static org.junit.Assert.*;
import org.junit.Test;
public class ClaculatorTest {

	@Test
	public void testAddition() {
		Claculator cal = new Claculator();
		assertEquals(6,cal.add(3,3));
		assertEquals(-9,cal.add(1,-10));
		assertEquals(1,cal.add(1,0));
	}
	@Test
	public void testMultiplication() {
		Claculator cal = new Claculator();
		assertEquals(2,cal.mul(2,1));
		assertEquals(0,cal.mul(3,0));
		assertEquals(-25,cal.mul(5,-5));
	}
	@Test
	public void testDivision() {
		Claculator cal = new Claculator();
		assertEquals(2,cal.div(10,5));
		assertEquals(0,cal.div(0,2));
		assertEquals(2,cal.div(5,2));
	}
}
