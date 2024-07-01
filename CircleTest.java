package lab5;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CircleTest {
    private Circle circle;

    @Before
    public void setUp() {
        Point center = new Point(0, 0);
        circle = new Circle(center, 5);
    }

    @Test
    public void testDia() {
        Circle c = new Circle(new Point(0, 0), 7);
        assertEquals(14, c.diameter(), 0);
    }

    @Test
    public void testArea() {
        Circle c = new Circle(new Point(0, 0), 4);
        assertEquals(16 * Math.PI, c.area(), 0);
    }

    @Test
    public void testCirc() {
        Circle c = new Circle(new Point(0, 0), 3);
        assertEquals(6 * Math.PI, c.circumference(), 0);
    }

    @Test
    public void testEq() {
        Circle c = new Circle(new Point(2, 3), 5);
        assertEquals("(x - 2)^2 + (y - 3)^2 = 25", c.equation());
    }

    @Test
    public void testNonOrigin() {
        Circle c = new Circle(new Point(1, 1), 6);
        assertEquals("(x - 1)^2 + (y - 1)^2 = 36", c.equation());
    }

    @Test
    public void testDiffRad() {
        Circle c = new Circle(new Point(0, 0), 8);
        assertEquals(16, c.diameter(), 0);
        assertEquals(64 * Math.PI, c.area(), 0);
        assertEquals(16 * Math.PI, c.circumference(), 0);
    }
}
