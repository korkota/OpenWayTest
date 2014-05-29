package com.summerschool;

public class SomeMath {
    public static double awesomeFunction(double a, double b, double c, double d) {
        double result = (a + b) / (c - d);

        if(result == Double.POSITIVE_INFINITY) {
            return Double.MAX_VALUE;
        }

        if(result == Double.NEGATIVE_INFINITY) {
            return Double.MIN_VALUE;
        }

        if(Double.isNaN(result)) {
            return 0;
        }

        return result;
    }
}
