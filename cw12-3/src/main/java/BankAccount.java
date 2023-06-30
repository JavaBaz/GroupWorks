public class BankAccount implements Runnable {
    private int balance =0;
    private String AccountName ;

    public BankAccount() {
    }

    public BankAccount(int balance,String AccountName) {
        this.balance = balance;
        this.AccountName=AccountName;
    }
    public int getBalance() {
        return balance;
    }
    public void depositing  (int money)
    {
        balance+=money;
    }
    public void withdrawing (int money){
        balance-=money;
    }

    @Override
    public String toString() {
        return  +
                "balance=" + balance +
                '}';
    }

    public void run() {
        for(int i=0;i<10000;i++)
        {
            depositing(10);
        }
    }
}
