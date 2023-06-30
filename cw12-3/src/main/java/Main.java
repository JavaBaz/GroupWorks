public class Main {

    public static void main(String[] args) {
        Thread ATM1 = new Thread(new BankAccount(23));
        Thread ATM2 = new Thread(new BankAccount(23));
        Thread ATM3 = new Thread(new BankAccount(23));
        Thread ATM4 = new Thread(new BankAccount(23));
        Thread ATM5 = new Thread(new BankAccount(23));
        ATM.start();
    }
}
