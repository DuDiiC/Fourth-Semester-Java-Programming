package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Number of parameters to call the program: " + args.length);

        // for-each loop
        for(String i : args) {
            System.out.println(i);
        }
    }
}
