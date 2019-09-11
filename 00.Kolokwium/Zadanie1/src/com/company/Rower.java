package com.company;

public class Rower extends Pojazd {

    public Rower() {
    }

    public Rower(String model, Double masa, Integer iloscMiejsc) {
        super(model, masa, iloscMiejsc);
    }

    @Override
    public boolean jestSilnikowy() {
        return false;
    }

    @Override
    public String toString() {
        return "Rower{" +
                "model='" + model + '\'' +
                ", masa=" + masa +
                ", iloscMiejsc=" + iloscMiejsc +
                '}';
    }
}
