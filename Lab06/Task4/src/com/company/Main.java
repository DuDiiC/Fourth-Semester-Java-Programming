package com.company;

public class Main {

    public static void main(String[] args) {
        ReadFromCSVFile readFromCSVFile = new ReadFromCSVFile("data.csv");
        readFromCSVFile.readData();
        readFromCSVFile.printData();
    }
}
