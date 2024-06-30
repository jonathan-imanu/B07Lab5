package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Circle_Testing {

	@Test
	public void testDiameter() {
		Circle c = new Circle(new Point(1, 0), 5);
		assertEquals(c.diameter(), 10.0);
	}
	
	@Test
	public void testArea() {
		Circle c = new Circle(new Point(1, 0), 5);
		assertNotEquals(c.area(), 25.0);
	}
	
	
	@Test
	public void testAreaEqual() {
		Circle c = new Circle(new Point(1, 0), 1.545096808);
		assertEquals(c.area(), 7.49999999909949);
	}
	
	@Test
	public void testCirc() {
		Circle c = new Circle(new Point(1, 0), 5);
		assertEquals(c.circumference(), 31.41592653589793);
	}
	
	@Test
	public void testCirEqual() {
		Circle c = new Circle(new Point(1, 0), 5);
		assertNotEquals(c.circumference(), 31.4159);
	}
	
	@Test
	public void testEquation() {
		Circle c = new Circle(new Point(1, 0), 5);
		assertEquals(c.equation(), "(x - 1.0)^2 + (y - 0.0)^2 = 25.0");
	}
	
}
