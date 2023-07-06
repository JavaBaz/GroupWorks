public class BankAccount implements Runnable {
    private int balance;
    private String accountName;


    public BankAccount(int balance,String accountName) {
        this.balance = balance;
        this.accountName =accountName;
    }

    public void depositing  (int money)
    {
        balance+=money;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance + " is in" +
                ", AccountName='" + accountName + '\'' +
                '}';
    }

    public void run() {
        for(int i=0;i<10;i++)
        {
            depositing(10);
            
            System.out.println(this.accountName + " in "+ Thread.currentThread().getName() + " in level"+ i);
        }
    }
}
