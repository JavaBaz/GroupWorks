package org.example;

import lombok.*;

@Data
public class CheckingAccount {
    private String customerNationalId;
    private String accountNumber;
    private double overdraftAmount;
    private double balance;
}
