package com.company;

public class Square implements Figure {

    private double side;

    public Square() { }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateField() {
        return Math.pow(side, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 4*side;
    }
}
