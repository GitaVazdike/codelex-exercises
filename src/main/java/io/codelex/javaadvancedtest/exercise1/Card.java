package io.codelex.javaadvancedtest.exercise1;

abstract class Card {
    private int cardNumber;
    private String fullName;
    private int ccvCode;
    private double balance;

    public Card(int cardNumber, String fullName, int ccvCode, double balance) {
        this.cardNumber = cardNumber;
        this.fullName = fullName;
        this.ccvCode = ccvCode;
        this.balance = balance;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getCcvCode() {
        return ccvCode;
    }

    public void setCcvCode(int ccvCode) {
        this.ccvCode = ccvCode;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void addMoney(double moneyAmount);

    public abstract void takeMoney(double moneyAmount) throws NotEnoughFundsException;

    public abstract void displayMessage();

    @Override
    public String toString() {
        return "Card{"
                + "cardNumber=" + cardNumber
                + ", fullName='" + fullName + '\''
                + ", ccvCode=" + ccvCode
                + ", balance=" + balance
                + '}';
    }
}