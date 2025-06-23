package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lab4Tests {
	
	@Test
	void test1() {
		Point p1 = new Point(0, 0);
		assertTrue(p1.x == 0 && p1.y == 0);
	}
	
	@Test
	void test2() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(1,0);
		
		assertTrue(p1.distance(p2) == 1);
	}
	
	@Test
	void test3() {
		Point p1 = new Point(9999, 0);
		assertTrue(p1.hashCode() == 29997);
	}
	
	@Test
	void test4() {
		Point p1 = new Point(0,0);
		assertTrue(p1.equals(p1));
	}
	
	@Test
	void test5() {
		Point p1 = new Point(0,0);
		Point p2 = null;
		assertFalse(p1.equals(p2));
	}
	
	@Test
	void test6() {
		Point p1 = new Point(0,0);
		Triangle t1 = new Triangle(p1,p1,p1);
		assertFalse(p1.equals(t1));
	}
	
	@Test
	void test7() {
		Point p1 = new Point(1,0);
		Point p2 = new Point(1,1);
		assertFalse(p1.equals(p2));
	}
	
	@Test
	void test8() {
		Point p1 = new Point(0,1);
		Point p2 = new Point(1,1);
		assertFalse(p1.equals(p2));
	}
	
	@Test
	void test9() {
		Point p1 = new Point(0,1);
		Point p2 = new Point(0,1);
		assertTrue(p1.equals(p2));
	}
	
	@Test
	void test10() {
		Point p1 = new Point(0,0);
		Triangle t1 = new Triangle(p1, p1, p1);
		assertTrue(t1.perimeter() == 0);
	}
	
	@Test
	void test11() {
		//(0,0), (Math.sqrt(5), 0), and (Math.sqrt(5)/2, Math.sqrt(15)/2)
		Triangle t1 = new Triangle(new Point(0,0), new Point(Math.sqrt(5), 0), new Point(Math.sqrt(5)/2, Math.sqrt(15)/2));
		assertTrue(t1.isEquilateral());
	}
	
	@Test
	void test12() {
		Point p1 = new Point(1,1);
		Point p2 = new Point(0,0);
		Triangle t1 = new Triangle(p1, p1, p2);
		assertFalse(t1.isEquilateral());
	}
}
