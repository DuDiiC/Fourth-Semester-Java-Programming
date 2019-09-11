package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Samochod> samochody = new ArrayList<>();

        Samochod samochod1 = new Samochod("Audi", 1600.0, 3000.0, 200312.0, 5);
        Samochod samochod2 = new Samochod("Opel", 4003.0, 4500.0, 18273.0, 7);
        Samochod samochod3 = new Samochod("Skoda", 1213.0, 3500.0, 331123.0, 5);
        Samochod samochod4 = new Samochod("Mercedes", 1898.0, 3000.0, 762412.0, 2);
        Samochod samochod5 = new Samochod("Fiat", 2400.0, 4000.0, 21334.0, 5);
        Samochod samochod6 = new Samochod("Ferrari", 4300.0, 2000.0, 89812.0, 2);
        Samochod samochod7 = new Samochod("Porche", 4300.0, 2500.0, 1000.0, 2);
        Samochod samochod8 = new Samochod("Toyota", 2600.0, 3500.0, 2000.0, 5);
        Samochod samochod9 = new Samochod("Bugatti", 5800.0, 4500.0, 873652.0, 2);

        samochody.add(samochod1);
        samochody.add(samochod2);
        samochody.add(samochod3);
        samochody.add(samochod4);
        samochody.add(samochod5);
        samochody.add(samochod6);
        samochody.add(samochod7);
        samochody.add(samochod8);
        samochody.add(samochod9);

        samochody.stream()
                .filter(s -> s.getPrzebieg() > 10000.0)
                .filter(s -> s.getPojemnoscSilnika() < 3000.0)
                .filter(s -> s.getIloscMiejsc() == 5)
                .map(Samochod::getModel)
                .forEach(System.out::println);
    }
}
