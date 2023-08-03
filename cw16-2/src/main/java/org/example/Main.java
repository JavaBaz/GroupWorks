package org.example;

public class Main {
    public static void main(String[] args) {


//        Short amin = Short.valueOf("327662");
//        System.out.println(amin);

        Short test = StringToIntegerConverter.convert("327662");
        System.out.println(test);
    }
}