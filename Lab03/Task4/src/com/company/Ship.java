package com.company;

public class Ship {

    protected double sideA;
    protected double sideB;
    protected double numberOfPassengers;
    protected double displacement; // pl wypornosc
    protected int ID;

    protected double field; // as rectangle

    public Ship() {};

    public Ship(double sideA, double sideB, double numberOfPassengers, double displacement, int ID) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.numberOfPassengers = numberOfPassengers;
        this.displacement = displacement;
        this.ID = ID;
        calculateField();
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(double numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getField() {
        return field;
    }

    public void setField(double field) {
        this.field = field;
    }

    public void calculateField() {
        field = sideA*sideB;
    }

}
