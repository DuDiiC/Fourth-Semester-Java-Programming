package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadFromCSVFile {

    private String filePath;
    private BufferedReader bufferedReader;
    private ArrayList<ArrayList<String>> dataFromFile = new ArrayList<>();

    public ReadFromCSVFile(String filePath) {
        this.filePath = filePath;
    }

    void readData() {
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(filePath)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String singleLineFromFile = null;
        while(true) {
            try {
                if (((singleLineFromFile = bufferedReader.readLine()) == null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            ArrayList<String> tmpArrayList = new ArrayList<String>(Arrays.asList(singleLineFromFile.split(";")));
            dataFromFile.add(tmpArrayList);
        }
    }

    void printData() {
        System.out.println(dataFromFile.size() + " " + dataFromFile.get(0).size());
        for(int i = 0; i < dataFromFile.size(); i++) {
            for(int j = 0; j < dataFromFile.get(i).size(); j++) {
                System.out.print(dataFromFile.get(i).get(j)+"\t");
                if(i!= 0) System.out.print("\t");
            }
            if(i != 0) System.out.print((Double) dataFromFile.get(i).stream().mapToDouble(Double::parseDouble).sum());
            System.out.println();
        }
    }
}
