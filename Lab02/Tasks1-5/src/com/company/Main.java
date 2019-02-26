package com.company;

public class Main {

    public static void main(String[] args) {

        Figure f1 = new Figure();
        Figure f2 = new Figure();

        f1.setField(10.2);
        f1.setPerimeter(-13.2);
        f1.setDimension(3);
        f1.setName("Circle");

        f2.setField(8);
        f2.setPerimeter(11.432);
        f2.setDimension(2);
        f2.setName("Square");

        System.out.println(f1);
        System.out.println(f2);

        System.out.println(f1.getCOUNTER());
        System.out.println(f2.getCOUNTER());
        f1.setCOUNTER(3);
        System.out.println(f1.getCOUNTER());
        System.out.println(f2.getCOUNTER());

        System.out.println(f1.isInside(0.1, 0.3));

        MonteCarlo mC = new MonteCarlo();
        System.out.println(mC.randomMethod(1000));
    }
}
