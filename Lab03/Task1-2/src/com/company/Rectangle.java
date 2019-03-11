package com.company;

public class Rectangle extends Figure {

    protected double sideA;
    protected double sideB;

    public Rectangle() {
        super();
    }

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        calculateField();
        calculatePerimeter();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", field=" + field +
                ", perimeter=" + perimeter +
                ", dimension=" + dimension +
                ", name='" + name + '\'' +
                ", uniqueCounter=" + uniqueCounter +
                '}';
    }

    @Override
    public void calculateField() {
        field = sideA*sideB;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2*sideA + 2*sideB;
    }

    @Override
    public void enlarge(double scale) {
        sideA *= scale;
        sideB *= scale;
        calculateField();
        calculatePerimeter();
    }
}
