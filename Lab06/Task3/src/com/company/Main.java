package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /* FOR ONE CLASS OBJECT */

        Car car1 = new Car("Mercedes", "S1", 2010, new Engine("First", "E30", 1, 2009));

        System.out.println(car1);

        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("carFile"));
            objectOutputStream.writeObject(car1);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("carFile"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Car car2 = null;
        try {
            car2 = (Car) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(car2);
        System.out.println();

        /* FOR OBJECTS LIST */

        Car car3 = new Car("Reno", "S2", 2011, new Engine("Second", "E40", 2, 2010));
	    Car car4 = new Car("Volvo", "S3", 2012, new Engine("Third", "E50", 3, 2011));
	    Car car5 = new Car("Opel", "S4", 2013, new Engine("Fourth", "E60", 4, 2012));

        ArrayList<Car> carArrayList = new ArrayList<>();
        carArrayList.add(car3);
        carArrayList.add(car4);
        carArrayList.add(car5);

        for(Car car : carArrayList) {
            System.out.println(car);
        }

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("carListFile"));
            objectOutputStream.writeObject(carArrayList);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Car> carArrayList2 = null;

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("carListFile"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            carArrayList2 = (ArrayList<Car>) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(Car car : carArrayList2) {
            System.out.println(car);
        }


    }
}
