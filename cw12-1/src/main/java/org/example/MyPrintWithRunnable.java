package org.example;

public class MyPrintWithRunnable implements Runnable  {
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
    @Override
    public void run() {
            try {

                for (int i = 0; i < 10; i++) {

                    // sleeping the thread for 500 milli seconds
                    Thread.sleep(100);
                    System.out.println("Hello World from : " + Thread.currentThread().getName() + " - Id is : " + Thread.currentThread().getId() );
                    System.out.println(Thread.currentThread().getName() +" -> "+ i);
                }
            }
            // catch block for catching the raised exception
            catch (Exception e) {
                System.out.println("The exception has been caught: " + e);
            }
        }

}