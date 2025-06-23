
public class RecException extends Exception {
	public RecException(String message) {
		super(message);
	}
}

public class Rectangle {
	Point A;
	Point B;
	Point C;
	Point D;

	public Rectangle(Point A, Point B, Point C, Point D) throws RecException {
		// Vectors representing sides
		Point ab = new Point(B.x - A.x, B.y - A.y);
		Point bc = new Point(C.x - B.x, C.y - B.y);
		Point cd = new Point(D.x - C.x, D.y - C.y);
		Point da = new Point(A.x - D.x, A.y - D.y);

		// Check for opposite sides' equality
		if (A.distance(B) != C.distance(D) || B.distance(C) != D.distance(A)) {
			throw new RecException("Not a rectangle");
		}

		// Check for right angles (dot product = 0)
		double rightangle1 = ab.x * bc.x + ab.y * bc.y;
		double rightangle2 = bc.x * cd.x + bc.y * cd.y;
		double rightangle3 = cd.x * da.x + cd.y * da.y;
		double rightangle4 = da.x * ab.x + da.y * ab.y;

		if (rightangle1 != 0 || rightangle2 != 0 || rightangle3 != 0 || rightangle4 != 0) {
			throw new RecException("Not a rectangle");
		}

		// Set points if all checks pass
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}

	public double perimeter() {
		return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
	}

	public boolean isSquare() {
		if (A.distance(B) == B.distance(C))
			return true;
		else
			return false;
	}

}