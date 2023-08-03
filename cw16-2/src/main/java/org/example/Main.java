package org.example;

public class Main {
    public static void main(String[] args) {

        String number = "1.2  ";
        Integer value = StringToIntegerConverter.convert(number);


        System.out.println(value);
    }
}