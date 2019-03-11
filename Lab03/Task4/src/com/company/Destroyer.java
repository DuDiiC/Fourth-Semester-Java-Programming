package com.company;

public class Destroyer extends Ship {

    protected double firepower;
    protected int numberOfCannons; // pl liczba dział

    public Destroyer() {};

    public Destroyer(double firepower, int numberOfCannons) {
        super();
        this.firepower = firepower;
        this.numberOfCannons = numberOfCannons;
    }

    public Destroyer(double sideA, double sideB, double numberOfPassengers, double displacement, int ID, double firepower, int numberOfCannons) {
        super(sideA, sideB, numberOfPassengers, displacement, ID);
        this.firepower = firepower;
        this.numberOfCannons = numberOfCannons;
    }

    public double getFirepower() {
        return firepower;
    }

    public void setFirepower(double firepower) {
        this.firepower = firepower;
    }

    public int getNumberOfCannons() {
        return numberOfCannons;
    }

    public void setNumberOfCannons(int numberOfCannons) {
        this.numberOfCannons = numberOfCannons;
    }

    @Override
    public String toString() {
        return "Destroyer{" +
                "firepower=" + firepower +
                ", numberOfCannons=" + numberOfCannons +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", numberOfPassangers=" + numberOfPassengers +
                ", displacement=" + displacement +
                ", ID=" + ID +
                ", field=" + field +
                '}';
    }
}
