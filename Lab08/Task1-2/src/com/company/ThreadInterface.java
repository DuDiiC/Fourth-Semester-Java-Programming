package com.company;

import java.util.Random;

import static java.lang.Thread.sleep;

public class ThreadInterface implements Runnable {
    @Override
    public void run() {
        Random random = new Random();
        for(int i = 0; i < 100; i++) {
            int sleepTime = Math.abs(random.nextInt()%10000);
            Thread thread = Thread.currentThread();
            System.out.println("Thread " + thread.getId() + " number " + i);
            try {
                sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
