package com.company;

public class Main {

    public static void main(String[] args) {

        double[] tab = {2, 2, 5, 7};
        Average avg = new ArithmeticAverage();
        Average avg2 = new GeometricAverage();
        Average avg3 = new HarmonicAverage();

        System.out.println(avg.calculateAverage(tab));
        System.out.println(avg2.calculateAverage(tab));
        System.out.println(avg3.calculateAverage(tab));
    }
}
