package com.company;

public class Boat extends Vehicle {

    public Boat(int seats) {
        super(seats);
    }

    @Override
    public boolean hasManyWheels() {
        return false;
    }

    @Override
    public boolean hasRoof() {
        return false;
    }

    @Override
    public boolean hasWaterproof() {
        return false;
    }

    @Override
    public void write() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Boat{" +
                "seats=" + seats +
                ", wheels=" + wheels +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }


}
