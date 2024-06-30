package lab5;

public class Circle {
	Point center;
	double radius;
	
	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public double diameter() {
		return 2.0 * radius;
	}
	
	public double area() {
		return Math.PI * (radius * radius);
	}
	
	public double circumference() {
		return Math.PI * (2.0 * radius);
	}
	
	public String equation() {
        return "(x - " + center.x + ")^2 + (y - " + center.y + ")^2 = " + (radius * radius);
    } 
}
