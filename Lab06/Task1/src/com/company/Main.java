package com.company;

public class Main {

    public static void main(String[] args) {
        ContentsOfCatalog contentsOfCatalog = new ContentsOfCatalog(System.getProperty("user.dir"));
        contentsOfCatalog.writeTheContent();
    }
}
