package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        File myObj= new File("cw21-2/src/main/resources/filename.txt");
        try {
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileWriter myObjCopy = new FileWriter(myObj);
            int numberOfLines = (int)(Math.random()*100);
            for (int i = 0; i < numberOfLines; i++) {
                int valueOfLines = (int)(Math.random()*10000);
                myObjCopy.write(valueOfLines + "\n");
                System.out.println(valueOfLines + " is added to file.");
            }
            myObjCopy.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("================");

        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}