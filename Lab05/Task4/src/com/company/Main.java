package com.company;

public class Main {

    public static void main(String[] args) {

        double[] equation = new double[] {2, 3, -2};
        SearchRoot searchRoot = new SearchRoot(equation);

        System.out.println(searchRoot.search(-4, 2));

    }
}
