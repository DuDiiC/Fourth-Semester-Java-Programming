package com.company;

public class Main {

    public static void main(String[] args) {
        MyExceptionTest myExceptionTest = new MyExceptionTest();
        double test = -1;
        try {
            myExceptionTest.rand();
        } catch (MyException e) {
            System.err.println("MyException exception");
        } finally {
            test = myExceptionTest.getVal();
            System.out.println("Test value = " + test);
        }
    }
}
