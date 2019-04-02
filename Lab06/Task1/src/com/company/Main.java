package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        ContentsOfCatalog contentsOfCatalog = null;
        try {
            // using the workspace catalog
            contentsOfCatalog = new ContentsOfCatalog(new File(".").getCanonicalPath()+"\\");
        } catch (IOException e) {
            e.printStackTrace();
        }
        contentsOfCatalog.writeTheContent();
    }
}
