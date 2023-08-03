package org.example;

import java.util.Scanner;

public class StringToIntegerConverter {


    public static short convert(String entryString) {

        Short result;

        try {
            result = Short.valueOf(entryString.trim());

        } catch (NumberFormatException e) {
            throw new NumberFormatException(" some Error ");
        }


        return result;
    }
}
