package io.codelex.classesandobjects.practice.exercise_8;

import java.util.Scanner;


public class SavingsAccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How much money is in the account? ");
        double startingBalance = input.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("How long has the account been opened? ");
        int numberOfMonths = input.nextInt();

        SavingsAccount account = new SavingsAccount(startingBalance);
        account.setAnnualInterestRate(annualInterestRate);

        double totalDeposit = 0.00;
        double totalWithdrawAmount = 0.00;
        double totalInterest = 0.00;

        for (int i = 1; i <= numberOfMonths; i++) {

            System.out.print("Enter amount deposited for month " + i + ": ");
            double deposit = input.nextDouble();
            totalDeposit += deposit;
            account.deposit(deposit);

            System.out.print("Enter amount withdrawn for month " + i + ": ");
            double withdrawal = input.nextDouble();
            totalWithdrawAmount += withdrawal;
            account.withdraw(withdrawal);

            totalInterest +=account.calculateMonthlyInterest();

        }
        System.out.println("Total deposited: " + account.format(totalDeposit));
        System.out.println("Total withdrawn: " + account.format(totalWithdrawAmount));
        System.out.println("Interest earned: " + account.format(totalInterest));
        System.out.println("Ending balance: " + account.format(account.getBalance()));
    }
}
