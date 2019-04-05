package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadDataFromFile {

    private String filePath;
    private BufferedReader bufferedReader;
    private ArrayList<ArrayList<String>> dataFromFile = new ArrayList<>();
    // MORE ???


    public ReadDataFromFile(String filePath) {
        this.filePath = filePath;
    }

    public void readData() {
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(filePath)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String singleLineFromFile = null;

        while(true) {
            try {
                if ((singleLineFromFile = bufferedReader.readLine()) == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            ArrayList<String> tmpArrayList = new ArrayList<>(Arrays.asList(singleLineFromFile.split("\t")));
            dataFromFile.add(tmpArrayList);
        }
    }

    public double sumForTaxC() {
        double sum = 0;
        for(int i = 0; i < dataFromFile.size(); i++) {
            try {
                if(dataFromFile.get(i).get(1).equals("C")) {
                    sum += Double.parseDouble(dataFromFile.get(i).get(2));
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Wrong format data in file - ArrayIndexOutOfBoundsException.");
            } catch (NumberFormatException e) {
                System.err.println("Wrong format data in file - NumberFormatException.");
            }
        }
        return sum;
    }
}
