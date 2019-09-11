package com.company;

public class Samochod extends Pojazd {

    private Double pojemnosc;

    public Samochod() {
    }

    public Samochod(String model, Double masa, Integer iloscMiejsc, Double pojemnosc) {
        super(model, masa, iloscMiejsc);
        this.pojemnosc = pojemnosc;
    }

    @Override
    public boolean jestSilnikowy() {
        return true;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "model='" + model + '\'' +
                ", masa=" + masa +
                ", iloscMiejsc=" + iloscMiejsc +
                ", pojemnosc=" + pojemnosc +
                '}';
    }

    public Double getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(Double pojemnosc) {
        this.pojemnosc = pojemnosc;
    }
}
