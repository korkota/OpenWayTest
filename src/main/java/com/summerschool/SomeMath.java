package com.summerschool;

public class SomeMath {
    public static double awesomeFunction(double a, double b, double c, double d) {
        double numerator = a + b;
        double denominator = c - d;
        double result;

        boolean numeratorIsMoreThenAbsMaxValue = sameSigns(a, b) && Double.isInfinite(numerator) && Math.abs(denominator) > 1;
        boolean numeratorIsLessThenAbsMinValue = oppositeSigns(a, b) && numerator == 0.0 && Math.abs(denominator) < 1;

        if (numeratorIsMoreThenAbsMaxValue || numeratorIsLessThenAbsMinValue) {
            result = a / denominator + b / denominator;
        } else {
            result = numerator / denominator;
        }

        if (result == Double.POSITIVE_INFINITY) {
            return Double.MAX_VALUE;
        }

        if (result == Double.NEGATIVE_INFINITY) {
            return -Double.MAX_VALUE;
        }

        if(Double.isNaN(result)) {
            return 0;
        }

        return result;
    }

    private static boolean sameSigns(double a, double b) {
        return (a > 0 && b > 0 || a < 0 && b < 0);
    }

    private static boolean oppositeSigns(double a, double b) {
        return (a > 0 && b < 0 || a < 0 && b > 0);
    }
}
