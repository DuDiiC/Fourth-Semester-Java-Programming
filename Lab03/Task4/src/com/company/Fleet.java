package com.company;

import java.util.List;
import java.util.ArrayList;

public class Fleet {

    protected List<Ship> wholeFleet = new ArrayList<>();

    protected double wholeFirepower;
    protected int wholePassengers;
    protected int wholeCannons;

    public Fleet() {}

    public void addToFleet(Ship s) {
        wholeFleet.add(s);
        calculateFleetSource();
    }

    public void calculateFleetSource() {

        double wholeFirepower = 0;
        int wholePassengers = 0;
        int wholeCannons = 0;

        for(Ship s : wholeFleet) {
            wholePassengers += s.getNumberOfPassengers();
            if(s instanceof Destroyer) {
                wholeFirepower += ((Destroyer) s).getFirepower();
                wholeCannons += ((Destroyer) s).getNumberOfCannons();
            }
        }

        this.wholeFirepower = wholeFirepower;
        this.wholePassengers = wholePassengers;
        this.wholeCannons = wholeCannons;
    }
}
