package Quadratic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticKeyTest {
    QuadraticKey newQuad = new QuadraticKey(2,-3,-6);
    //uncomment when ready
    //Quadratic newQuad = new Quadratic(2,-3,-6);

    @Test
    void getA() {
        assertEquals(2,newQuad.getA());
    }

    @Test
    void getB() {
        assertEquals(-3,newQuad.getB());
    }

    @Test
    void getC() {
        assertEquals(-6,newQuad.getC());
    }

    @Test
    void setA() {
        newQuad.setA(3);
        assertEquals(3,newQuad.getA());
        newQuad.setA(2);
    }

    @Test
    void setB() {
        newQuad.setB(8);
        assertEquals(8,newQuad.getB());
        newQuad.setB(-3);
    }

    @Test
    void setC() {
        newQuad.setC(-10);
        assertEquals(-10,newQuad.getC());
        newQuad.setC(-6);
    }

    @Test
    void discriminant() {

        assertEquals(57.0,newQuad.discriminant(),2);
    }

    @Test
    void hasRealSolutions() {
        assertTrue(newQuad.hasRealSolutions());
    }

    @Test
    void roots() {
        double[] roots = newQuad.roots();
        assertEquals(2.68,roots[0],2);
        assertEquals(-1.14,roots[1],2);
    }
}