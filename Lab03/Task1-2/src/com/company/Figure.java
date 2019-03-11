package com.company;

public class Figure {

    private static int COUNTER = 0;

    protected double field;
    protected double perimeter;
    protected double dimension;
    protected String name;
    protected int uniqueCounter;

    public Figure() {
        field = 0;
        perimeter = 0;
        dimension = 0;
        name = "none";
        uniqueCounter = COUNTER;
    }

    public Figure(double dimension) {
        field = 0;
        perimeter = 0;
        this.dimension = dimension;
        name = "none";
        uniqueCounter = COUNTER;
    }

    /** SETTERS AND GETTERS */
    public static int getCOUNTER() {
        return COUNTER;
    }

    public static void setCOUNTER(int COUNTER) {
        Figure.COUNTER = COUNTER;
    }

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

    public int getUniqueCounter() {
        return uniqueCounter;
    }

    public void setUniqueCounter(int uniqueCounter) {
        this.uniqueCounter = uniqueCounter;
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
            figure += ", field=" + field;
        }

        if(perimeter > 0) {
            figure += ", perimeter=" + perimeter;
        }

        figure += ", uniqueCounter=" + uniqueCounter;

        return figure;
    }

    /** SET VALUES METHODS */
    public void setValues(double field, double perimeter) {
        this.field = field;
        this.perimeter = perimeter;
    }

    public void setValues(double dimension) {
        this.dimension = dimension;
    }

    public void setValues(String name) {
        this.name = name;
    }

    /** I can't do this, because it is the same function, not overloaded.
     public void setValues(double field) {
     this.field = field;
     }*/

    /** alternative method */
    public void setValue(double temp, boolean flag) {
        if(flag) {
            this.field = temp;
        } else {
            this.perimeter = temp;
        }
    }

    public boolean isInside(double x, double y) {
        return dimension > Math.pow(x, 2) + Math.pow(y, 2);
    }

    public void calculateField() {
        field = 0;
    }

    public void calculatePerimeter() {
        perimeter = 0;
    }

    public void enlarge(double scale) {}
}
