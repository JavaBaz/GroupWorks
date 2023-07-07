package com.hw11;


import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> myTestHashMap = new ConcurrentHashMap<>();

        myTestHashMap.put(1,"0");



        myThread thread1 = new myThread(myTestHashMap);
        myThread thread2 = new myThread(myTestHashMap);
        myThread thread3 = new myThread(myTestHashMap);
        myThread thread4 = new myThread(myTestHashMap);
        myThread thread5 = new myThread(myTestHashMap);
        myThread thread6 = new myThread(myTestHashMap);
        myThread thread7 = new myThread(myTestHashMap);
        myThread thread8 = new myThread(myTestHashMap);
        myThread thread9 = new myThread(myTestHashMap);
        myThread thread10= new myThread(myTestHashMap);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();


        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
            thread6.join();
            thread7.join();
            thread8.join();
            thread9.join();
            thread10.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(myTestHashMap.size());
    }
}