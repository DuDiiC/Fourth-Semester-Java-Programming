package com.company;

import java.io.*;

public class CopyFilesSignBySign {

    private String filePath;
    private FileReader fileReader;
    private FileWriter fileWriter;

    public CopyFilesSignBySign(String filePath) {
        this.filePath = filePath;
    }

    public void copyFile() {
        try {
            fileReader = new FileReader(new File(this.filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            fileWriter = new FileWriter(new File("copiedSignBySign.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        while(true) {
            try {
                if (!fileReader.ready()) break;
                fileWriter.write(fileReader.read());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            fileReader.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
