package com.company;

import java.util.Random;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) {

	    Thread t1 = new Thread() {
			@Override
			public void run() {
				Random random = new Random();
				for(int i = 0; i < 100; i++) {
					int sleepTime = Math.abs(random.nextInt()%1000);
					Thread thread = Thread.currentThread();
					System.out.println("Thread " + thread.getId() + " number " + i);
					try {
						sleep(sleepTime);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
	    Thread t2 = new Thread(new ThreadInterface());
	    Thread t3 = new Thread(new ThreadInterface());
	    Thread t4 = new Thread(new ThreadInterface());

	    t1.start();
	    t2.start();
	    t3.start();
	    t4.start();
    }
}
