package com.company;

public abstract class Vehicle implements Comparable<Vehicle> {

    protected int seats;
    protected int wheels;
    protected double price;
    protected double weight;

    public Vehicle() {}

    public Vehicle(int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract boolean hasManyWheels();
    public abstract boolean hasRoof();
    public abstract boolean hasWaterproof();
    public abstract void write();

    @Override
    public int compareTo(Vehicle v) {
        return (this.seats - v.seats);
    }
}
