package com.company;

public class Car extends Vehicle {

    @Override
    public boolean hasManyWheels() {
        return true;
    }

    @Override
    public boolean hasRoof() {
        return true;
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
        return "Car{" +
                "seats=" + seats +
                ", wheels=" + wheels +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
