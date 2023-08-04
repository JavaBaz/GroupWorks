package org.example;

import lombok.*;
@Data
@AllArgsConstructor
public class CheckingAccount extends BankAccount {
    private String customerNationalId;
    private String accountNumber;
    private double balance;
    private double overdraftAmount;


    public CheckingAccount(String userName, String password, double amount) {
        super(userName, password, amount);
    }
}
