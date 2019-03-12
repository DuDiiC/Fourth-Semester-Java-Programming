package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Car(5);
        Vehicle v2 = new Bike(2);
        Vehicle v3 = new Boat(12);

        Vehicle[] tab = {v1, v2, v3};
        for(Vehicle i : tab) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println();

        Arrays.sort(tab);

        for(Vehicle i : tab) {
            System.out.println(i);
        }



    }
}
