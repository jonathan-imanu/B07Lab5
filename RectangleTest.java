package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void testConstructor() {
		Rectangle abcd = new Rectangle(new Point (0, 4), new Point (4,0));
		assertTrue(abcd instanceof Rectangle);
	}
	
	@Test
	void testArea() {
		Rectangle abcd = new Rectangle(new Point (0, 8), new Point (8,0));
		double expected = 64.0;
		double actual = abcd.area();
		assertEquals(expected, actual);
	}
	
	@Test
	void testPerimeter() {
		Rectangle abcd = new Rectangle(new Point (0, 2), new Point (2,0));
		double expected = 8.0;
		double actual = abcd.perimeter();
		assertEquals(expected, actual);
	}
	
	@Test
	void testSquare1() {
		Rectangle abcd = new Rectangle(new Point (0, 4), new Point (4,0));
		assertEquals(true, abcd.isSquare());
	}
	
	@Test
	void testSquare2() {
		Rectangle abcd = new Rectangle(new Point (0, 7), new Point (4,0));
		assertEquals(false, abcd.isSquare());
	}
}
