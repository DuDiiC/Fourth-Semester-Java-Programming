package com.company;

public class HarmonicAverage implements Average {

    @Override
    public double calculateAverage(double[] tab) {
        double sum = 0;
        for(double i : tab) {
            sum += (double)1/i;
        }
        return (double)tab.length/sum;
    }
}
