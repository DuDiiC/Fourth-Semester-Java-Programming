package com.company;

public class IncreaseThread extends Thread {

    private final Counter counter;

    public IncreaseThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {

        synchronized (counter) {
            for (int i = 0; i < 20; i++) {
                counter.increaseCount();
                System.out.println("Counter have value: " + counter.getCount() + " in thread: " + getName());
            }
        }
    }
}
