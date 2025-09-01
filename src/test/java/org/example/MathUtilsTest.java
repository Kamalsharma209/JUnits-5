package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {
    private MathUtils mathUtils;

    @BeforeEach
    public void setUp() {
        mathUtils = new MathUtils();
        System.out.println("setUp");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown");
    }

    @Test
    void testAdd() {
        int result = mathUtils.add(2, 3);  // use mathUtils method instead of 2+3
        assertEquals(5, result);
    }

    @Test
    void testMul() {
        int result = mathUtils.mul(5, 2);
        assertEquals(10, result);
    }

    @Test
    void testAreaOfCircle() {
        assertEquals(0, mathUtils.AreaOfCircle(0));
    }

    @Test
    void testCircumference() {
        double expected = Math.PI * 2 * 7;
        assertEquals(expected, mathUtils.circumference(7));
    }

    @Test
    void testDiv() {
        assertThrows(ArithmeticException.class,
                () -> mathUtils.div(1, 0),
                "Division by 0 should throw exception");
    }
}
