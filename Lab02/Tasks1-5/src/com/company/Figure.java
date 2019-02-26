package com.company;

public class Figure {

    private double field;
    private double perimeter;
    private double dimension;
    private String name;

    public Figure() {
        field = 0;
        perimeter = 0;
        dimension = 0;
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

    public double getDimension() {
        return dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
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

    /** toString() method */
    @Override
    public String toString() {

        String figure = "Figure: " + name;

        if(field > 0) {
            figure += ", field="+field;
        }

        if(perimeter > 0) {
            figure += ", perimeter="+perimeter;
        }

        return figure;
    }

    /** SET VALUES METHODS */
    public void setValues(double field, double perimeter) {
        this.field = field;
        this.perimeter = perimeter;
    }
}
