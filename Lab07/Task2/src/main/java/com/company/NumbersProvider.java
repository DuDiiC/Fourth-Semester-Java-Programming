package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class NumbersProvider {

    private List<String> firstLine;
    private List<String> secondLine;
    private List<String> thirdLine;

    public NumbersProvider(String filePath) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(filePath)));
            try {
                firstLine = Arrays.asList(bufferedReader.readLine().split(";"));
                secondLine = Arrays.asList(bufferedReader.readLine().split(";"));
                thirdLine = Arrays.asList(bufferedReader.readLine().split(";"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<String> getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(List<String> firstLine) {
        this.firstLine = firstLine;
    }

    public List<String> getSecondLine() {
        return secondLine;
    }

    public void setSecondLine(List<String> secondLine) {
        this.secondLine = secondLine;
    }

    public List<String> getThirdLine() {
        return thirdLine;
    }

    public void setThirdLine(List<String> thirdLine) {
        this.thirdLine = thirdLine;
    }
}
