package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTests {
	
	@Test
	void test1() {
		Point p1 = new Point(0,0);
		Point p2 = p1;
		Circle c1 = new Circle(p1, 2);
		assertEquals(c1.A, p2);
	}
	
	@Test
	void test2() {
		Point p1 = new Point(0,0);
		Circle c1 = new Circle(p1, 2);
		assertEquals(c1.radius, 2);
	}
	
	
	@Test
	void test3() {
		Point p1 = new Point(0,0);
		Circle c1 = new Circle(p1, 2);
		assertTrue(c1.diameter() == 4);
	}
	
	@Test
	void test4() {
		Point p1 = new Point(0,0);
		Circle c1 = new Circle(p1, 2);
		assertTrue(c1.area() == 4*Math.PI);
	}
	
}