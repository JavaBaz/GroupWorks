package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {



        Thread myPrinter = new Thread(new MyPrintWithRunnable());
        myPrinter.setPriority(10);
        myPrinter.start();

        Thread myPrinter2 = new Thread(new MyPrintWithRunnable());
        myPrinter2.setDaemon(true);
        myPrinter2.start();


//      Thread.currentThread().sleep(3000);
        System.out.println("------END------");

    }
}