package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTests {
    @Test
    void testArea() {
        Point p1 = new Point(0,0), p2 = new Point(0, 1), p3 = new Point(1, 0), p4 = new Point(1, 1);
        assertEquals(new Rectangle(p1, p2, p3, p4).Area(), 1);
    }
    
    @Test
    void testPerimeter() {
        Point p1 = new Point(0,0), p2 = new Point(0, 1), p3 = new Point(1, 0), p4 = new Point(1, 1);
        assertEquals(new Rectangle(p1, p2, p3, p4).Perimeter(), 4);
    }
    
    @Test
    void testHashCode() {
        Point p1 = new Point(0,0), p2 = new Point(0, 1), p3 = new Point(1, 0), p4 = new Point(1, 1), p5 = new Point(2, 2), p6 = new Point(2, 4), p7 = new Point(5, 2), p8 = new Point(5, 4);
        assertNotEquals(new Rectangle(p1, p2, p3, p4).hashCode(), new Rectangle(p5, p6, p7, p8).hashCode());
    }
    
    @Test
    void testEquals() {
        Point p1 = new Point(0,0), p2 = new Point(0, 1), p3 = new Point(1, 0), p4 = new Point(1, 1), p5 = new Point(2, 2), p6 = new Point(2, 4), p7 = new Point(5, 2), p8 = new Point(5, 4);
        Rectangle r1 = new Rectangle(p1, p2, p3, p4);
        assertTrue(r1.equals(r1));
        assertFalse(r1.equals(null));
        assertFalse(r1.equals("a"));
        assertFalse(r1.equals(new Rectangle(p5, p6, p7, p8)));
        assertTrue(r1.equals(new Rectangle(p1, p2, p3, p4)));
    }
}