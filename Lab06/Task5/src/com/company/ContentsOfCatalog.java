package com.company;

import java.io.File;
import java.io.FileFilter;
import java.util.Date;

public class ContentsOfCatalog {

    private String catalogName;

    ContentsOfCatalog(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public void writeTheContent() {
        File directory = new File(catalogName);
        File[] filesInDirectory = directory.listFiles();

        try {
            for (File f : filesInDirectory) {
                if (f.isDirectory()) {
                    System.out.print(File.separator);
                }
                System.out.print(f.getName() + "\t");
                System.out.print(" size: " + f.length() + "\t");
                System.out.print(" last modify: ");
                Date date = new Date(f.lastModified());
                System.out.println(date);
                System.out.println();

            }
        } catch (NullPointerException e) {
            System.err.println("NullPointerException error");
        }
    }
}