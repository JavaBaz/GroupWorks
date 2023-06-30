package org.example;

public class MyPrintWithThread extends Thread {

    @Override
    public void run(){
        System.out.println("Hello World");
    }
}
