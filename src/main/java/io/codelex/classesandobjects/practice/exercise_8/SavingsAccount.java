package io.codelex.classesandobjects.practice.exercise_8;

import java.text.NumberFormat;
import java.util.Locale;

public class SavingsAccount {
    private double annualInterestRate;
    private double balance;


    public SavingsAccount(double startingBalance) {
        balance = startingBalance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double withdrawAmount) {
        balance -= withdrawAmount;
    }

    public void deposit(double deposit) {
        balance += deposit;
    }

    public double calculateMonthlyInterest() {
        double monthlyInterestRate = annualInterestRate / 12;
        double monthlyInterest = monthlyInterestRate * balance;
        balance += monthlyInterest;
        return monthlyInterest;
    }

    public String format(double amount) {
        return NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(amount);
    }
}
