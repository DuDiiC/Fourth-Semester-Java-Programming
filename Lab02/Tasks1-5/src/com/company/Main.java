package com.company;

public class Main {

    public static void main(String[] args) {

        Figure f1 = new Figure();
        Figure f2 = new Figure();

        f1.setField(10.2);
        f1.setPerimeter(-13.2);
        f1.setDimention(3);
        f1.setName("Circle");

        f2.setField(8);
        f2.setPerimeter(11.432);
        f2.setDimention(2);
        f2.setName("Square");

        System.out.println(f1);
        System.out.println(f2);


    }
}
