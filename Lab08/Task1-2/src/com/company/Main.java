package com.company;

public class Main {

    public static void main(String[] args) {
	    PrintThread t1 = new PrintThread();
	    PrintThread t2 = new PrintThread();
	    PrintThread t3 = new PrintThread();
	    PrintThread t4 = new PrintThread();

	    t1.start();
	    t2.start();
	    t3.start();
	    t4.start();
    }
}
