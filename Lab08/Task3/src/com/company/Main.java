package com.company;

public class Main {

    public static void main(String[] args) {

        Counter counter = new Counter(3);

        IncreaseThread increaseThread1 = new IncreaseThread(counter);
        IncreaseThread increaseThread2 = new IncreaseThread(counter);
        IncreaseThread increaseThread3 = new IncreaseThread(counter);
        IncreaseThread increaseThread4 = new IncreaseThread(counter);
        IncreaseThread increaseThread5 = new IncreaseThread(counter);


        increaseThread1.start();
        increaseThread2.start();
        increaseThread3.start();
        increaseThread4.start();
        increaseThread5.start();
    }
}
