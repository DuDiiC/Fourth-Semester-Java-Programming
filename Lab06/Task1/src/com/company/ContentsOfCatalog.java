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
        FileFilter fileFilter = pathname -> {
            if(pathname.getName().endsWith(".txt")) {
                return false;
            }
            return true;
        };
        File[] filesInDirectory = directory.listFiles(fileFilter);

        try {
            for (File f : filesInDirectory) {
                if (f.isDirectory()) {
                    System.out.print(File.separator);
                }
                System.out.println(f.getName());
                System.out.println(" size: " + f.length());
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
