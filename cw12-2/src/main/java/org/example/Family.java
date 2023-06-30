package org.example;

import java.util.Random;

public class Family implements Runnable{

    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Family(String name) {
        this.name = name;
    }

    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    public void run() {

        Random random = new Random();
        int timeToGetJobDone = random.nextInt(2000,5000);


        try {
                Thread.sleep(timeToGetJobDone);
                System.out.println(this.name + " has done the job ");
        }
        catch (Exception e) {
            System.out.println("The exception has been caught: " + e);
        }

    }



}

