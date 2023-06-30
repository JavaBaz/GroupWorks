package org.example;

public class Main {
    public static void main(String[] args) {


        Thread Mother = new Thread(new Family());
        Thread Father = new Thread(new Family());
        Thread Son = new Thread(new Family());

        Mother.start();
        Father.start();
        Son.start();


    }
}