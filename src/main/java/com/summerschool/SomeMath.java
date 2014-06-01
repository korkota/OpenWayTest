package com.summerschool;

public class SomeMath {
    public static double awesomeFunction(double a, double b, double c, double d) {
        double result = (a + b) / (c - d);

        // Path #1.
        if (result == Double.POSITIVE_INFINITY) {
            return Double.MAX_VALUE;
        }

        // Path #2.
        if (result == Double.NEGATIVE_INFINITY) {
            return -Double.MAX_VALUE;
        }

        // Path #3.
        if(Double.isNaN(result)) {
            return 0;
        }

        // Path #4.
        return result;
    }
}
