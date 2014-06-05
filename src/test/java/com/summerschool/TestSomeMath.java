package com.summerschool;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestSomeMath {
    private static final double delta = 0.0;

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

    @Test
    public void testAwesomeFunctionWhenResultShouldBeZero() {
        double a, b, c, d;
        a = b = c = d = 0;

        double result = SomeMath.awesomeFunction(a, b, c, d);
        double expected = 0;

        assertEquals(expected, result, delta);
    }

    @Test
        public void testAwesomeFunctionWhenNumeratorIsMoreAbsMaxValue() {
        double a, b;
        a = b = Double.MAX_VALUE;
        double c = 100;
        double d = 0;

        double result = SomeMath.awesomeFunction(a, b, c, d);
        double expected = a / (c - d) + b / (c - d);

        assertEquals(expected, result, delta);
    }

    @Test
    public void testAwesomeFunctionWhenNumeratorIsLessAbsMinValue() {
        double a = 1.5 * Double.MIN_VALUE;
        double b = -Double.MIN_VALUE;
        double c = 0.0001;
        double d = 0;

        double result = SomeMath.awesomeFunction(a, b, c, d);
        double expected = a / (c - d) + b / (c - d);

        assertEquals(expected, result, delta);
    }

    @Test
    public void testAwesomeFunctionWhenResultShouldBe42() {
        double a = 21;
        double b = 21;
        double c = 2;
        double d = 1;

        double result = SomeMath.awesomeFunction(a, b, c, d);
        double expected = 42;

        assertEquals(expected, result, delta);
    }
}
