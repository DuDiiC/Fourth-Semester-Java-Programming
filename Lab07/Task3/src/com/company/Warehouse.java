package com.company;

public class Warehouse {

    private int productsNumber;
    private int[] products = null;

    public Warehouse(int productsNumber)
            throws IllegalArgumentException {
        if(productsNumber <= 0) {
            throw new IllegalArgumentException();
        }

        this.productsNumber = productsNumber;
        products  = new int[productsNumber];
        for(int i : products) i = 0;
    }

    public int getProductsNumber() {
        return productsNumber;
    }

    public void addProduct(int id, int howMany)
            throws IllegalArgumentException, ArrayIndexOutOfBoundsException {
        if(id < 0 || id >= productsNumber) {
            throw new ArrayIndexOutOfBoundsException();
        } else if(howMany <= 0) {
            throw new IllegalArgumentException();
        }

        products[id] += howMany;
    }

    public void spendProduct(int id, int howMany)
            throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if(id < 0 || id >= productsNumber) {
            throw new ArrayIndexOutOfBoundsException();
        } else if(howMany <= 0 || products[id]-howMany < 0) {
            throw new IllegalArgumentException();
        }

        products[id] -= howMany;
    }

    public int resetProduct(int id)
            throws ArrayIndexOutOfBoundsException {
        if(id < 0 || id >= productsNumber) {
            throw new ArrayIndexOutOfBoundsException();
        }

        int tmp = products[id];
        products[id] = 0;
        return tmp;
    }

    public int returnProduct(int id)
            throws ArrayIndexOutOfBoundsException {
        if(id < 0 || id >= productsNumber) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return products[id];
    }

    public int returnAllProductsNumber() {
        int sum = 0;
        for(int i : products) {
            sum += i;
        }
        return sum;
    }
}
