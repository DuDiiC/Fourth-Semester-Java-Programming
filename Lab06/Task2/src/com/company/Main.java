package com.company;

public class Main {

    public static void main(String[] args) {

        CopyFilesSignBySign copyFilesSignBySign = new CopyFilesSignBySign("test.txt");
        copyFilesSignBySign.copyFile();

        CopyFilesLineByLine copyFilesLineByLine = new CopyFilesLineByLine("test.txt");
        copyFilesLineByLine.copyFile();

    }
}
