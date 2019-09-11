package com.company;

public abstract class Pojazd {

    protected String model;
    protected Double masa;
    protected Integer iloscMiejsc;

    public Pojazd() {
    }

    public Pojazd(String model, Double masa, Integer iloscMiejsc) {
        this.model = model;
        this.masa = masa;
        this.iloscMiejsc = iloscMiejsc;
    }

    public void jedzie() {
        System.out.println("Pojazd jedzie");
    }

    public void stoi() {
        System.out.println("Pojazd stoi");
    }

    abstract public boolean jestSilnikowy();

    @Override
    public String toString() {
        return "Pojazd{" +
                "model='" + model + '\'' +
                ", masa=" + masa +
                ", iloscMiejsc=" + iloscMiejsc +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getMasa() {
        return masa;
    }

    public void setMasa(Double masa) {
        this.masa = masa;
    }

    public Integer getIloscMiejsc() {
        return iloscMiejsc;
    }

    public void setIloscMiejsc(Integer iloscMiejsc) {
        this.iloscMiejsc = iloscMiejsc;
    }
}
