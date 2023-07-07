package cw131;

import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Vector<Integer> shop = new Vector<>();

        for (int i = 0; i < 15; i++) {
            shop.add(1);
            Random random = new Random();
            int rand = random.nextInt(0, 15);
            shop.setElementAt(rand, i);
        }


        System.out.println("===============================================");
        System.out.println(shop);
        System.out.println("===============================================");
        System.out.println();

        Producer producer = new Producer(shop);
        Consumer consumer1 = new Consumer(shop);
        Consumer consumer2 = new Consumer(shop);
        Consumer consumer3 = new Consumer(shop);
        Consumer consumer4 = new Consumer(shop);
        Consumer consumer5 = new Consumer(shop);
        Consumer consumer6 = new Consumer(shop);
        Consumer consumer7 = new Consumer(shop);



        producer.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();
        consumer4.start();
        consumer5.start();
        consumer6.start();
        consumer7.start();




        try {
            producer.join();
            consumer1.join();
            consumer2.join();
            consumer3.join();
            consumer4.join();
            consumer5.join();
            consumer6.join();
            consumer7.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


}
