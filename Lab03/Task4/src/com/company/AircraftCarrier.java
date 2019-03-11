package com.company;

public class AircraftCarrier extends Destroyer {

    protected int numberOfPlanes;

    public AircraftCarrier(int numberOfPlanes) {
        super();
        this.numberOfPlanes = numberOfPlanes;
    }

    public AircraftCarrier(double firepower, int numberOfCannons, int numberOfPlanes) {
        super(firepower, numberOfCannons);
        this.numberOfPlanes = numberOfPlanes;
    }

    public AircraftCarrier(double sideA, double sideB, double numberOfPassengers, double displacement, int ID, double firepower, int numberOfCannons, int numberOfPlanes) {
        super(sideA, sideB, numberOfPassengers, displacement, ID, firepower, numberOfCannons);
        this.numberOfPlanes = numberOfPlanes;
    }

    public int getNumberOfPlanes() {
        return numberOfPlanes;
    }

    public void setNumberOfPlanes(int numberOfPlanes) {
        this.numberOfPlanes = numberOfPlanes;
    }

    @Override
    public String toString() {
        return "AircraftCarrier{" +
                "numberOfPlanes=" + numberOfPlanes +
                ", firepower=" + firepower +
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
