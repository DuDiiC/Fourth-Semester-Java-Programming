package com.company;

public class GeometricAverage implements Average {

    @Override
    public double calculateAverage(double[] tab) {
        double product = 1;
        for(double i : tab) {
            product *= i;
        }
        return Math.pow(product, (double)1/(double)tab.length);
    }
}
