package cw131;


import java.util.Vector;

public class Producer extends Thread{

    Vector<Integer> shop;


    public Producer(Vector<Integer> shop) {
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
                if (tmp <= 0)
                    shop.setElementAt(10,i);
                System.out.println("Producer from " + this.getName()+" -> "+shop);

            }
        }

    }


}
