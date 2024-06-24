package lab4;

public class Rectangle {
	Point TL;
    Point TR;
    Point BL;
	Point BR;

	public Rectangle(Point TL, Point BR) {
		this.TL = TL;
		this.BR = BR;
        this.TR = new Point(BR.x, TL.y);
        this.BL= new Point(TL.x, BR.y);
	}

    public double area() {
		return TL.distance(BL) * TL.distance(TR);
	}
	
	public double perimeter() {
		return TL.distance(BL) * 2 + TL.distance((TR));
	}
	
	public boolean isSquare() {
		return TL.distance(BL) == TL.distance(TR);
	}
}