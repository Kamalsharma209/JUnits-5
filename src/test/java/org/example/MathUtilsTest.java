package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    void testAdd() {
        int result = 2 + 3;
        assertEquals(5, result);  // JUnit 5 assertion
    }
    @Test
    void testmul(){
        int result = 5* 2;
        assertEquals(10, result);
    }
    @Test
    void testAreaOfCircle(){
        MathUtils mathutils =new MathUtils();
        assertEquals(0,mathutils.AreaOfCircle(0));
    }
    @Test
    void testcircumference(){
        MathUtils mathutils =new MathUtils();
        double expected = Math.PI * 2* 7;
        assertEquals(expected,mathutils.circumference(7));
    }
    @Test
    void testdiv(){
        MathUtils mathutils =new MathUtils();
        assertThrows(ArithmeticException.class,() -> mathutils.div(1,0),"Division of 0 ");
    }
}
