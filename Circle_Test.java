package lab5;

import static org.junit.jupiter.api.Assertions.*;

class circle_test {

	@Test
	void testdiameter{
		Circle c = new Circle(new Point(1, 0), 5);
		assertEqual(c.diameter(), 10);
	}
	
	
	
}
