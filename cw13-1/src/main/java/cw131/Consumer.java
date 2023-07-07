package cw131;

import java.util.Vector;

public class Consumer extends Thread{

    Vector<Integer> shop;


    public Consumer(Vector<Integer> shop) {
        this.shop = shop;
    }

    @Override
    public void run(){
        while (true){

            for (int i = 0; i < shop.size(); i++) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                int tmp =  this.shop.get(i);
                if (tmp > 0)
                    shop.setElementAt(tmp-1, i);

                System.out.println("Consumer from " + this.getName()+" -> "+shop);
            }
        }
    }

}
