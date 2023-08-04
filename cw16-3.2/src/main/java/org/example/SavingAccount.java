package org.example;

import lombok.*;

@Data
public class SavingAccount {
    private String customerNationalId;
    private String accountNumber;
    private double balance;
    private double interestAmount;

}
