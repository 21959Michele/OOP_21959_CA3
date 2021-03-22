package com.company;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public CreateFile(String fileName) {
        try {
            File myObj = new File(fileName+".txt");
            if (myObj.createNewFile()) {
                System.out.println("File created successfully: " + myObj.getName());
            } else {
                System.out.println("Existing file, rename and try again.");
            }
        } catch (IOException e) {
            System.out.println("ERROR.");
            e.printStackTrace();
        }
    }
}