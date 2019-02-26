package com.company;

import java.util.Formatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();

        Formatter formatter = new Formatter();

        formatter.format("%-10.3f %-10.3f\n", firstNumber, secondNumber);
        formatter.format("%s %s", firstString, secondString);

        System.out.println(formatter.toString());

    }
}
