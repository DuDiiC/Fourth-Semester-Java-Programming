package com.company;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
        calculateField();
        calculatePerimeter();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", field=" + field +
                ", perimeter=" + perimeter +
                ", dimension=" + dimension +
                ", name='" + name + '\'' +
                ", uniqueCounter=" + uniqueCounter +
                '}';
    }

    @Override
    public void calculateField() {
        field = Math.PI*Math.pow(radius, 2);
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2*Math.PI*radius;
    }
}
