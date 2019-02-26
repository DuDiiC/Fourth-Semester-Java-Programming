package com.company;

import java.util.Scanner;

public class Integral {

    public static void main(String[] args) {
        double a, b, c, x1, x2;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        x1 = scanner.nextDouble();
        x2 = scanner.nextDouble();

        scanner.close();

        System.out.println(Integral.calculateIntegral(a, b, c, x1, x2));
    }

    private static double calculateIntegral(double a, double b, double c, double x1, double x2) {

        double lim_x1 = (a/3)*Math.pow(x1, 3) + (b/2)*Math.pow(x1, 2) + c*x1;
        double lim_x2 = (a/3)*Math.pow(x2, 3) + (b/2)*Math.pow(x2, 2) + c*x2;

        return lim_x2 - lim_x1;
    }


}
