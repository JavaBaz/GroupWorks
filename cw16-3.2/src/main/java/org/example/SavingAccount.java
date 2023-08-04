package org.example;

import lombok.*;

@Data
@AllArgsConstructor
public class SavingAccount extends BankAccount {
    private String customerNationalId;
    private String accountNumber;
    private double balance;
    private double interestAmount;

    public SavingAccount(String userName, String password, double amount) {
        super(userName, password, amount);
    }

    public void addInterest() {
        balance=balance+balance*interestAmount;
    }
}
