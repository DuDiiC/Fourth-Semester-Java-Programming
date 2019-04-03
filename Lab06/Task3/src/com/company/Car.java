package com.company;

import java.io.Serializable;

public class Car implements Serializable {

    private String company;
    private String model;
    private int productionYear;
    private Engine engine;

    public Car(String company, String model, int productionYear, Engine engine) {
        this.company = company;
        this.model = model;
        this.productionYear = productionYear;
        this.engine = engine;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company = '" + company + '\'' +
                ", model = '" + model + '\'' +
                ", productionYear = " + productionYear +
                ", engine = " + engine +
                '}';
    }
}
