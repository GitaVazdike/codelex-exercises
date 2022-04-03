package io.codelex.javaadvancedtest.exercise1;

import java.math.BigDecimal;

abstract class Card {
    private int cardNumber;
    private String fullName;
    private String ccvCode;
    private BigDecimal balance;

    public Card(int cardNumber, String fullName, String ccvCode, BigDecimal balance) {
        this.cardNumber = cardNumber;
        this.fullName = fullName;
        this.ccvCode = ccvCode;
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void addMoney(BigDecimal moneyAmount) {
        balance = balance.add(moneyAmount);
    }

    public void takeMoney(BigDecimal moneyAmount) throws NotEnoughFundsException {
        if (moneyAmount.compareTo(getBalance()) == 1) {
            throw new NotEnoughFundsException("Insufficient funds");
        }
        balance = balance.subtract(moneyAmount);
    }

    public abstract void displayMessage();

    @Override
    public String toString() {
        return "Card{"
                + "cardNumber=" + cardNumber
                + ", fullName='" + fullName + '\''
                + ", ccvCode='" + ccvCode + '\''
                + ", balance=" + balance
                + '}';
    }
}