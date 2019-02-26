package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] tab = new int[size];
        for(int i = 0; i < size; i++) {
            tab[i] = scanner.nextInt();
        }

        IntervalSum iSum = new IntervalSum(size, tab);

        int start, end;
        while(scanner.hasNextInt()) {
            start = scanner.nextInt();
            end = scanner.nextInt();

            System.out.println(iSum.calculateSum(start, end));
        }

        scanner.close();
    }
}
