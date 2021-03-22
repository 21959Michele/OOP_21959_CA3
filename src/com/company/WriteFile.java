package com.company;

import java.io.*;

public class WriteFile {


    public WriteFile(String fileName) {
        try {
            FileWriter myWriter = new FileWriter(fileName+".txt");
            myWriter.write(fileName+": \n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }
        //# Feature: Exception
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public WriteFile(Dog dog, String fileName) {

        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName+".txt", true)));) {
            String info = "\n" + dog.toString();
            File file = new File(fileName+".txt");
            out.println(info);
        } catch(IOException e) {
        }
    }
}

