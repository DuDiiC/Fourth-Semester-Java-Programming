package com.company;

public class ArithmeticAverage implements Average {

    @Override
    public double calculateAverage(double[] tab) {
        double sum = 0;
        for(double i : tab) {
            sum += i;
        }
        return sum/tab.length;
    }
}
