package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("produkty.txt")));

        String najdrozszuProduktA = null;
        Double cenaNajdrozszegoProduktuA = 0.0;
        String najdrozszuProduktB = null;
        Double cenaNajdrozszegoProduktuB = 0.0;

        while(bufferedReader.ready()) {
            String[] linia = bufferedReader.readLine().split(";");
            if(linia[1].equals("A")) {
                if(najdrozszuProduktA == null || cenaNajdrozszegoProduktuA < Double.valueOf(linia[2])) {
                    najdrozszuProduktA = linia[0];
                    cenaNajdrozszegoProduktuA = Double.valueOf(linia[2]);
                }
            } else if(linia[1].equals("B")) {
                if(najdrozszuProduktB == null || cenaNajdrozszegoProduktuB < Double.valueOf(linia[2])) {
                    najdrozszuProduktB = linia[0];
                    cenaNajdrozszegoProduktuB = Double.valueOf(linia[2]);
                }
            }
        }

        System.out.println("Najdrozszy produkt A to " + najdrozszuProduktA + " o cenie " + cenaNajdrozszegoProduktuA);
        System.out.println("Najdrozszy produkt B to " + najdrozszuProduktB + " o cenie " + cenaNajdrozszegoProduktuB);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("drogie.txt")));
        bufferedWriter.write(najdrozszuProduktA);
        bufferedWriter.newLine();
        bufferedWriter.write(najdrozszuProduktB);
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();

    }
}
