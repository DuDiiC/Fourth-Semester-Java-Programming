package com.company;

import java.io.*;

public class CopyFilesLineByLine {

    private String filePath;
    private String newFilePath;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;

    public CopyFilesLineByLine(String filePath, String newFilePath) {
        this.filePath = filePath;
        this.newFilePath = newFilePath;
    }

    void copyFile() {
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(filePath)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(new File(newFilePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String tmp = null;

        while(true) {
            try {
                if (((tmp = bufferedReader.readLine()) == null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedWriter.write(tmp);
                bufferedWriter.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}