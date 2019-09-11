package com.company;

public class Samochod {

    private String model;
    private Double pojemnoscSilnika;
    private Double masa;
    private Double przebieg;
    private Integer iloscMiejsc;

    public Samochod() {
    }

    public Samochod(String model, Double pojemnoscSilnika, Double masa, Double przebieg, Integer iloscMiejsc) {
        this.model = model;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.masa = masa;
        this.przebieg = przebieg;
        this.iloscMiejsc = iloscMiejsc;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "model='" + model + '\'' +
                ", pojemnoscSilnika=" + pojemnoscSilnika +
                ", masa=" + masa +
                ", przebieg=" + przebieg +
                ", iloscMiejsc=" + iloscMiejsc +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(Double pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public Double getMasa() {
        return masa;
    }

    public void setMasa(Double masa) {
        this.masa = masa;
    }

    public Double getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(Double przebieg) {
        this.przebieg = przebieg;
    }

    public Integer getIloscMiejsc() {
        return iloscMiejsc;
    }

    public void setIloscMiejsc(Integer iloscMiejsc) {
        this.iloscMiejsc = iloscMiejsc;
    }
}
