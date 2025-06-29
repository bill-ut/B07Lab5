import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTests {

	@Test
	void test1() throws RecException {
		Point A = new Point(0,0);
		Point B = new Point(3,0);
		Point C = new Point(3,3);
		Point D = new Point(0,3);
		Rectangle rect = new Rectangle(A, B, C, D);
		assertEquals(12.0, rect.perimeter());
		assertTrue(rect.isSquare());
	}
	@Test
	void test2() throws RecException{
		Point A = new Point(0,0);
		Point B = new Point(4,0);
		Point C = new Point(4,3);
		Point D = new Point(0,3);
		Rectangle rect = new Rectangle(A, B, C, D);
		assertEquals(14.0, rect.perimeter());
		assertFalse(rect.isSquare());
		
	}

}
