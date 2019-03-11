package com.company;

public class Main {

    public static void main(String[] args) {

        Ship s1 = new Ship(3, 4, 12, 10, 1);
        Ship s2 = new Ship(3, 4, 10, 13, 2);
        Ship s3 = new Destroyer(3, 4, 10, 13, 3, 12, 3);
        Ship s4 = new Destroyer(3, 4, 10, 13, 4, 11, 4);
        Ship s5 = new AircraftCarrier(3, 4, 10, 13, 5, 11, 4, 4);

        Fleet f = new Fleet();
        f.addToFleet(s1);
        f.addToFleet(s2);
        f.addToFleet(s3);
        f.addToFleet(s4);
        f.addToFleet(s5);

        System.out.println(f.wholeCannons);
        System.out.println(f.wholeFirepower);
        System.out.println(f.wholePassengers);

    }
}
