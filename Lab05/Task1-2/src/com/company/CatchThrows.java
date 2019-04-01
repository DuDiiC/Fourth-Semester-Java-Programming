package com.company;

public class CatchThrows {

    public void calculateReverse(Double[] tab) throws NullPointerException, Exception {

        for(int i = 0; i <= tab.length; ++i) {
            try {
                tab[i] = 1.0 / tab[i];
                System.out.println(tab[i]);
            } catch (ArithmeticException e) {
                System.err.println("Throw ArithmeticException in " + i + " position.");
            }
        }
    }
}
