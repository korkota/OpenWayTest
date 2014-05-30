package com.summerschool;

public class SomeMath {
    public static double awesomeFunction(double a, double b, double c, double d) {
        double result = (a + b) / (c - d);

        if(Double.isInfinite(result)) {
            return (result > 0) ? Double.MAX_VALUE : Double.MIN_VALUE;
        }

        if(Double.isNaN(result)) {
            return 0;
        }

        return result;
    }
}
