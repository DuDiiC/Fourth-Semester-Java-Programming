package com.company;

public class Triangle implements Figure {

    private double sideA;
    private double sideB;
    private double sideC;
    private double H;

    public Triangle() { }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        H = 0;
    }

    public Triangle(double sideA, double sideB, double sideC, double H) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.H = H;
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

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getH() {
        return H;
    }

    public void setH(double h) {
        this.H = h;
    }

    @Override
    public double calculateField() {
        if(H != 0) {
            return sideA*H/2;
        } else {
            double p = (double)1/2 * (sideA+sideB+sideC);
            double tmp = p*(p-sideA)*(p-sideB)*(p-sideC);
            return Math.sqrt(tmp);
        }
    }

    @Override
    public double calculatePerimeter() {
        return sideA+sideB+sideC;
    }
}
