package com.company;

public class Bike extends Vehicle {

    public Bike(int seats) {
        super(seats);
    }

    @Override
    public boolean hasManyWheels() {
        return true;
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
        return "Bike{" +
                "seats=" + seats +
                ", wheels=" + wheels +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
