package com.company;

public class CatchThrows {

    public void calculateReverse(double[] tab) {

        for(int i = 0; i < tab.length; ++i) {
            try {
                tab[i] = 1.0 / tab[i];
                System.out.println(tab[i]);
            } catch (NullPointerException e) {
                System.err.println("Throw NullPointerException in " + i + " position.");
            } catch (ArithmeticException e) {
                System.err.println("Throw ArithmeticException in " + i + " position.");
            } catch (Exception e) {
                System.err.println("Another exception in " + i + " position.");
            }
        }
    }
}
