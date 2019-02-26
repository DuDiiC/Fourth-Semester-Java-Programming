package com.company;

public class Figure {

    private double field;
    private double perimeter;
    private double dimention;
    private String name;

    public Figure() {
        field = 0;
        perimeter = 0;
        dimention = 0;
        name = "none";
    }

    /** SETTERS AND GETTERS */
    public double getField() {
        return field;
    }

    public void setField(double field) {
        this.field = field;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getDimention() {
        return dimention;
    }

    public void setDimention(double dimention) {
        this.dimention = dimention;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Figure: " + name);
        System.out.println("Field: " + field);
        System.out.println("Perimeter: " + perimeter);
    }
}
