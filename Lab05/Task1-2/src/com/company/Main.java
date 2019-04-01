package com.company;

public class Main {

    public static void main(String[] args) {
        double[] tab = new double[] {3.4, 23, 2.3, 1.0/3};
        CatchThrows catchThrows = new CatchThrows();

        catchThrows.calculateReverse(tab);
    }
}
