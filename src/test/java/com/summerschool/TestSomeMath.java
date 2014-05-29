package com.summerschool;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestSomeMath {
    private static final double delta = 0.0;

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

    @Test
    public void testAwesomeFunctionWhenResultShouldBePositiveInfinite() {
        double a = 1;
        double b = 2;
        double c, d;
        c = d = 4;

        double result = SomeMath.awesomeFunction(a, b, c, d);
        double expected = Double.MAX_VALUE;

        assertEquals(expected, result, delta);
    }

    @Test
    public void testAwesomeFunctionWhenResultShouldBeNegativeInfinite() {
        double a = -1;
        double b = -2;
        double c, d;
        c = d = 4;

        double result = SomeMath.awesomeFunction(a, b, c, d);
        double expected = Double.MIN_VALUE;

        assertEquals(expected, result, delta);
    }

    @Test
    public void testAwesomeFunctionWhenResultShouldBeNaN() {
        double a, b, c, d;
        a = b = c = d = 0;

        double result = SomeMath.awesomeFunction(a, b, c, d);
        double expected = 0;

        assertEquals(expected, result, delta);
    }

    @Test
    public void testAwesomeFunctionWithNaNArguments() {
        double a, b, c, d;
        a = b = c = d = Double.NaN;

        double result = SomeMath.awesomeFunction(a, b, c, d);
        double expected = 0;

        assertEquals(expected, result, delta);
    }

    @Test
    public void testAwesomeFunctionWithNegativeInfiniteArguments() {
        double a, b, c, d;
        a = b = c = d = Double.NEGATIVE_INFINITY;

        double result = SomeMath.awesomeFunction(a, b, c, d);
        double expected = 0;

        assertEquals(expected, result, delta);
    }

    @Test
    public void testAwesomeFunctionWithPositiveInfiniteArguments() {
        double a, b, c, d;
        a = b = c = d = Double.POSITIVE_INFINITY;

        double result = SomeMath.awesomeFunction(a, b, c, d);
        double expected = 0;

        assertEquals(expected, result, delta);
    }
}
