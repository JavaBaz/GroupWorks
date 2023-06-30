package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        Thread Mother = new Thread(new Family("Mother"));
        Thread Father = new Thread(new Family("Father"));
        Thread Son = new Thread(new Family("Son"));

        Mother.start();
        Father.start();
        Son.start();



        Thread.sleep(5001);

        if (!Mother.isAlive() && !Son.isAlive() && !Father.isAlive()) {
            System.out.println("Breakfast is ready!!!");
        }

        else {
            System.out.println("Breakfast is NOT ready!!!");
        }


    }
}