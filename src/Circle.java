package lab4;

public class Circle {
	Point A;
	Double radius;
	
	public Circle(Point A, double radius) {
		this.A = A;
		this.radius = radius;
		
	}
	
	public double diameter() {
		return 2*radius;
		
	}
	
	public double area() {
		return Math.PI * radius * radius;
	}
	
	
}
