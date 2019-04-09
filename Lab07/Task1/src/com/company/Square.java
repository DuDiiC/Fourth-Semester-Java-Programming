package com.company;

public class Square {

    private double side;

    public Square(double side) throws IllegalArgumentException {
        if(side <= 0) {
            throw new IllegalArgumentException("Side is less than or equal zero.");
        }
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double calculateField() {
        return side*side;
    }

    public double calculateCircuit() {
        return 4*side;
    }

    public void enlarge(double scale) {
        side *= scale;
    }
}
