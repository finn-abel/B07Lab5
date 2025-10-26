package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTests {

	@Test
	void testConstructorv1() {
		Circle C = new Circle();
		assertTrue(C.radius==0 && C.center.x==0 && C.center.y==0);
	}
	
	@Test
	void testConstructorv2() {
		Point Center = new Point(2.5,3.7);
		Circle C = new Circle(Center, 9);
		assertTrue(C.center.x==2.5 && C.center.y==3.7 && C.radius==9);
	}
	
	@Test
	void testConstructorv3() {
		Circle C = new Circle(2.7,3.5, 9);
		assertTrue(C.center.x==2.7 && C.center.y==3.5 && C.radius==9);
	}
	
	@Test
	void testgetAreav1() {
		Point Center = new Point(2.5,3.7);
		Circle C = new Circle(Center, 9);
		assertEquals(Math.PI*9*9,C.getArea());
	}
	
	@Test
	void testgetAreav2() {
		Point Center = new Point(2.5,3.7);
		Circle C = new Circle(Center, 0);
		assertEquals(0, C.getArea());
	}
	
	@Test
	void testgetCircumferencev1() {
		Point Center = new Point(2.5,3.7);
		Circle C = new Circle(Center, 9);
		assertEquals(2*Math.PI*9,C.getCircumference());
		
	}
	
	@Test
	void testgetCircumferencev2() {
		Point Center = new Point(2.5,3.7);
		Circle C = new Circle(Center, 0);
		assertEquals(0, C.getCircumference());
	}
	
	@Test
	void testgetDiameterv1() {
		Point Center = new Point(2.5,3.7);
		Circle C = new Circle(Center, 0);
		assertEquals(0, C.getDiameter());
	}
	
	@Test
	void testgetDiameterv2() {
		Point Center = new Point(2.5,3.7);
		Circle C = new Circle(Center, 9);
		assertEquals(2*9, C.getDiameter());
	}
	
	@Test
	void testcontainedInv1() {
		Point Center = new Point(2.5,3.7);
		Circle C = new Circle(Center, 9);
		assertTrue(C.containedIn(Center));
	}
	
	@Test
	void testcontainedInv2() {
		Point Center = new Point(2.5,3.7);
		Circle C = new Circle(Center, 9);
		Point P = new Point(11.5,3.7);
		assertTrue(C.containedIn(P));
	}
	
	@Test
	void testcontainedInv3() {
		Point Center = new Point(2.5,3.7);
		Circle C = new Circle(Center, 9);
		Point P = new Point(2,4);
		assertTrue(C.containedIn(P));
	}
	
	@Test
	void testcontainedInv4() {
		Point Center = new Point(2.5,3.7);
		Circle C = new Circle(Center, 9);
		Point P = new Point(12,4);
		assertFalse(C.containedIn(P));
	}
	
	@Test
	void testgetArcLengthv1() {
		Point Center = new Point(2.5,3.7);
		Circle C = new Circle(Center, 9);
		double angle = 0;
		assertEquals(0, C.getArcLength(angle));
	}
	
	@Test
	void testgetArcLengthv2() {
		Point Center = new Point(2.5,3.7);
		Circle C = new Circle(Center, 9);
		double angle = 360;
		assertEquals(2*Math.PI*9, C.getArcLength(angle));
	}
	
	@Test
	void testgetArcLengthv3() {
		Point Center = new Point(2.5,3.7);
		Circle C = new Circle(Center, 9);
		double angle = 60;
		assertEquals((angle/360)*2*Math.PI*9, C.getArcLength(angle));
	}
}
