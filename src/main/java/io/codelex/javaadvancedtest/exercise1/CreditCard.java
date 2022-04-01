package io.codelex.javaadvancedtest.exercise1;

public class CreditCard extends Card {

    public CreditCard(int cardNumber, String fullName, int ccvCode, double balance) {
        super(cardNumber, fullName, ccvCode, balance);
    }

    @Override
    public void addMoney(double moneyAmount) {
        setBalance(getBalance() + moneyAmount);
    }

    @Override
    public void takeMoney(double moneyAmount) throws NotEnoughFundsException {
        if (moneyAmount > getBalance()) {
            throw new NotEnoughFundsException("Insufficient funds");
        } else if (getBalance() - moneyAmount < 100) {
            displayMessage();
        } else {
            setBalance(getBalance() - moneyAmount);
        }
    }

    @Override
    public void displayMessage() {
        System.out.println("Warning: Low funds");
    }
}
