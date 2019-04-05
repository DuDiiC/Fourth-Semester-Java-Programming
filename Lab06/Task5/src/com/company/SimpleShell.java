package com.company;

import java.util.Scanner;

public class SimpleShell {

    void startShell() {

        Scanner scanner = new Scanner(System.in);

        String[] instruction;
        while(true) {
            instruction = scanner.nextLine().split(" ");
            if(instruction[0].equals("copy")) {
                try{
                    CopyFilesLineByLine copyFilesLineByLine = new CopyFilesLineByLine(instruction[1], instruction[2]);
                    copyFilesLineByLine.copyFile();
                    System.out.println("OK");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println("Wrongly syntax, you have to write source and destiny path.");
                }
            } else if(instruction[0].equals("ls")) {
                ContentsOfCatalog contentsOfCatalog = new ContentsOfCatalog(System.getProperty("user.dir"));
                contentsOfCatalog.writeTheContent();
            } else if(instruction[0].equals("exit") || instruction[0].equals("quit")) {
                break;
            }
        }
    }
}
