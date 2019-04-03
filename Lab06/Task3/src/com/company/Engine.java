package com.company;

import java.io.Serializable;

public class Engine implements Serializable {

    private String name;
    private String model;
    private int number;
    private int productionYear;

    public Engine(String name, String model, int number, int productionYear) {
        this.name = name;
        this.model = model;
        this.number = number;
        this.productionYear = productionYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name = '" + name + '\'' +
                ", model = '" + model + '\'' +
                ", number = " + number +
                ", productionYear = " + productionYear +
                '}';
    }
}
