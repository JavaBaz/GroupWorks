package org.example;

import java.util.Scanner;

public class StringToIntegerConverter {


    public  static Integer convert(String entryString) {

        Integer result = null;
        try {

            result = Integer.valueOf(entryString.trim());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException -----  forInputString");
        }

        return result;
    }
}
