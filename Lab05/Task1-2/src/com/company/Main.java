package com.company;

public class Main {

    public static void main(String[] args) {
        Double[] tab = new Double[] {3.4, 23.0, 2.3, 1.0/3};
        //tab[2] = null;
        CatchThrows catchThrows = new CatchThrows();

        try {
            catchThrows.calculateReverse(tab);
        } catch(NullPointerException e) {
            System.err.println("Throw NullPointerException in tab.");
        } catch (Exception e) {
            System.err.println("Another Exception in tab.");
        }
    }
}
