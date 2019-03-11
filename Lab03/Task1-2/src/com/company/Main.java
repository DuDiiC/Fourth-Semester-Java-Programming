package com.company;

public class Main {

    public static void main(String[] args) {

        Figure rec = new Rectangle(3, 5);
        Figure cir = new Circle(5);
        Figure squ = new Square(3);

        Figure [] tab = new Figure[]{rec, cir, squ};
        for(Figure f : tab) {
            System.out.println(f);
        }
        for(Figure f : tab) {
            f.enlarge(2);
        }
        for(Figure f : tab) {
            System.out.println(f);
        }

    }
}
