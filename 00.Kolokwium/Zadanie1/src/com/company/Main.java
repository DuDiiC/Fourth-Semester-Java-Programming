package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Samochod auto1 = new Samochod("Audi A8", 12348.76, 2, 4.5);
        Samochod auto2 = new Samochod("Audi A6", 2244.32, 5, 1.6);
        Samochod auto3 = new Samochod("Audi A5", 6234.17, 5, 1.6);
        Samochod auto4 = new Samochod("Audi A3", 2222.72, 5, 2.4);
        Samochod auto5 = new Samochod("Porche", 7612.89, 7, 1.6);

        Rower rower1 = new Rower("Skladak", 31.45, 1);
        Rower rower2 = new Rower("Gorski", 45.21, 1);
        Rower rower3 = new Rower("Szosowy", 18.65, 2);
        Rower rower4 = new Rower("sportowy", 7.22, 1);
        Rower rower5 = new Rower("parowy", 123.45, 2);

        List<Pojazd> pojazdy = new ArrayList<>();
        pojazdy.add(auto1);
        pojazdy.add(auto2);
        pojazdy.add(auto3);
        pojazdy.add(auto4);
        pojazdy.add(auto5);

        pojazdy.add(rower1);
        pojazdy.add(rower2);
        pojazdy.add(rower3);
        pojazdy.add(rower4);
        pojazdy.add(rower5);

        for (Pojazd p : pojazdy) {
            System.out.println(p);
            p.jedzie();
            p.stoi();
            p.jestSilnikowy();
        }
    }
}
