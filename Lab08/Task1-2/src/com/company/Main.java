package com.company;

public class Main {

    public static void main(String[] args) {
    	
	    Thread t1 = new Thread(new ThreadInterface());
	    Thread t2 = new Thread(new ThreadInterface());
	    Thread t3 = new Thread(new ThreadInterface());
	    Thread t4 = new Thread(new ThreadInterface());

	    t1.start();
	    t2.start();
	    t3.start();
	    t4.start();
    }
}
