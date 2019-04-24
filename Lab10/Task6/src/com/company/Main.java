package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        int[] tab1 = new int[10];
        int[] tab2 = new int[10];
        int[] tab3 = new int[10];

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            tab1[i] = random.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            tab2[i] = random.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            tab3[i] = random.nextInt();
        }

        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(new File("data.csv")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            bufferedWriter.write(Arrays.stream(tab1)
                    .peek(i -> i+=10)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(";")));
            bufferedWriter.newLine();
            bufferedWriter.write(Arrays.stream(tab2)
                    .peek(i -> i+=10)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(";")));
            bufferedWriter.newLine();
            bufferedWriter.write(Arrays.stream(tab3)
                    .peek(i -> i+=10)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(";")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
