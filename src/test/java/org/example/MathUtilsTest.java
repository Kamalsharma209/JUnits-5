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
    void circumference(){
        MathUtils mathutils =new MathUtils();
        assertEquals(0,mathutils.circumference(0));
    }
}
