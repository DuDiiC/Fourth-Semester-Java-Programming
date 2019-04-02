package com.company;

public class SearchRoot {

    private static double EPSILON = 0.000001;

    private double[] equation; // [0] = a, [1] = b, [2] = c in ax^2 + bx + c

    public SearchRoot(double[] equation) {
        this.equation = equation;
    }

    public double search(double start, double end) {
        double centerPoint;
        while(end-start > EPSILON) {
            centerPoint = (start+end)*0.5;
            try {
                testInterval(start, centerPoint);
                end = centerPoint;
            } catch (IncorrectIntervalException e) {
                start = centerPoint;
            }
        }
        return (start+end)*0.5;
    }

    private double value(double x) {
        return equation[0]*x*x + equation[1]*x + equation[2];
    }

    private void testInterval(double start, double end) throws IncorrectIntervalException {
        if(value(start) * value(end) > 0) {
            throw new IncorrectIntervalException();
        }
    }
}
