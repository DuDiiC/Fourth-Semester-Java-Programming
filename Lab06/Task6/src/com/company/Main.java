package com.company;

public class Main {

    public static void main(String[] args) {
	    ReadDataFromFile readDataFromFile = new ReadDataFromFile("test.txt");
	    readDataFromFile.readData();
		System.out.println(readDataFromFile.sumForTaxC());
    }
}
