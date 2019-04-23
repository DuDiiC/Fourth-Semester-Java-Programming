package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            Random random = new Random();
            int n = random.nextInt()%100;
            for(int i = 0; i <= n; i+=2) {
                System.out.println(i);
            }
        });

        thread.run();
    }
}
