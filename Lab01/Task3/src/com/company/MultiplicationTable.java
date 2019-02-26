package com.company;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tabSize = scanner.nextInt();

        MultiplicationTable.printTable(tabSize);
    }

    private static void printTable(int tabSize) {

        for(int i = 1; i <= tabSize; i++) {
            for(int j = 1; j <= tabSize; j++) {
                System.out.format("%5d", i*j);
            }
            System.out.println();
        }
    }
}
