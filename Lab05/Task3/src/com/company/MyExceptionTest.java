package com.company;

import java.util.Random;

public class MyExceptionTest {

    private double val;

    public double getVal() {
        return val;
    }

    public void setVal(double val) {
        this.val = val;
    }

    public void rand() throws MyException {
        Random random = new Random();
        val = random.nextDouble();
        if (val < 0.25) {
            throw new MyException();
        }
    }
}
