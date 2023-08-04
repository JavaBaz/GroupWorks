package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
public class BankAccount {
    private String customerNationalId;
    private String accountNumber;
    private double balance;

    public BankAccount() {

    }

    public void withdraw(double v) {
        if(v<0) {
            throw new  IllegalArgumentException("Sorry, you can not withdraw a negative amount");
        };
        if (v>balance){throw new RuntimeException("Your balance is not enough");}
        if (v<=balance){
            balance=balance-v;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double v) {
        if (v>0){
            balance+=v;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Objects.equals(customerNationalId, that.customerNationalId) && Objects.equals(accountNumber, that.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerNationalId, accountNumber);
    }
}
