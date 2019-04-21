package com.company;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        File dir = new File(System.getProperty("user.dir"));

        File[] TXTFiles = dir.listFiles((file) -> (file.getName().endsWith(".txt") && (file.length() > 1024*10)));
        List<File> listFiles = Arrays.asList(TXTFiles);
        listFiles.forEach(s -> System.out.println(s.getName() + " " + s.length()));
    }
}
