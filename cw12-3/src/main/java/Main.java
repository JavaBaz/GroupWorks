public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread ATM1 = new Thread(new BankAccount(53,"Amin"));
        Thread ATM2 = new Thread(new BankAccount(23,"Navid"));
        Thread ATM3 = new Thread(new BankAccount(853,"Saber"));
        Thread ATM4 = new Thread(new BankAccount(43,"Mehdi"));
        Thread ATM5 = new Thread(new BankAccount(5683,"AmirReza"));
        Thread ATM6 = new Thread(new BankAccount(457,"AmirAli"));

        Thread.currentThread().join();

        ATM1.start();
        ATM2.start();
        ATM3.start();
        ATM3.join();

        ATM4.start();
        ATM5.start();
        ATM6.start();
        ATM6.join();


    }
}
