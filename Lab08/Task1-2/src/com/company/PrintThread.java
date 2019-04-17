package com.company;

import java.util.Random;

public class PrintThread extends Thread {

    @Override
    public void run() {
        Random random = new Random();
        for(int i = 0; i < 100; i++) {
            int sleepTime = Math.abs(random.nextInt()%10000);
            System.out.println("Thread " + getId() + " number " + i);
            try {
                sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
