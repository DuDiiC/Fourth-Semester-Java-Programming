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

        Stack s = new Stack();
        s.add(tab[0]);
        s.add(tab[1]);
        s.add(tab[2]);

        System.out.println();
        System.out.println();
        while(!s.isEmpty()) {
            Object o = s.remove(s.size()-1);
            System.out.println(o);
        }
    }
}
