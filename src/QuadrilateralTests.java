package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuadrilateralTests {
	
	@Test
	void test1() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(1,0);
		Point p3 = new Point(0,1);
		Point p4 = new Point(1,1);
		
		Quadrilateral q1 = new Quadrilateral(p1,p2,p3,p4);
		assertTrue(q1.A.equals(p1) && q1.B.equals(p2) && q1.C.equals(p3), q1.D.equals(p4));
	}
	
	void test2() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(1,0);
		Point p3 = new Point(0,1);
		Point p4 = new Point(1,1);
		
		Quadrilateral q1 = new Quadrilateral(p1,p2,p3,p4);
		assertTrue(q1.isRhombus());
	}
	
	void test3() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(1,0);
		Point p3 = new Point(0,1);
		Point p4 = new Point(1,1);
		
		Quadrilateral q1 = new Quadrilateral(p1,p2,p3,p4);
		assertTrue(q1.isParallelogram());
	}
}