package com.summerschool;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestSomeMath {
    private static final double delta = 0.0;

    /**
     * Testing of the path #1.
     */
    @Test
    public void testAwesomeFunctionWhenResultShouldBeMaxValue() {
        double a = 1;
        double b = 2;
        double c, d;
        c = d = 4;

        double result = SomeMath.awesomeFunction(a, b, c, d);
        double expected = Double.MAX_VALUE;

        assertEquals(expected, result, delta);
    }

    /**
     * Testing of the path #2.
     */
    @Test
    public void testAwesomeFunctionWhenResultShouldBeMinValue() {
        double a = -1;
        double b = -2;
        double c, d;
        c = d = 4;

        double result = SomeMath.awesomeFunction(a, b, c, d);
        double expected = -Double.MAX_VALUE;

        assertEquals(expected, result, delta);
    }

    /**
     * Testing of the path #3.
     */
    @Test
    public void testAwesomeFunctionWhenResultShouldBeZero() {
        double a, b, c, d;
        a = b = c = d = 0;

        double result = SomeMath.awesomeFunction(a, b, c, d);
        double expected = 0;

        assertEquals(expected, result, delta);
    }

    /**
     * Testing of the path #4.
     */
    @Test
    public void testAwesomeFunctionWhenResultShouldBeFiniteNumber() {
        double a = 21;
        double b = 21;
        double c = 4;
        double d = 3;

        double result = SomeMath.awesomeFunction(a, b, c, d);
        double expected = 42;

        assertEquals(expected, result, delta);
    }
}
