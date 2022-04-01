package io.codelex.javaadvancedtest.exercise1;

public class DebitCard extends Card {

    public DebitCard(int cardNumber, String fullName, int ccvCode, double balance) {
        super(cardNumber, fullName, ccvCode, balance);
    }

    @Override
    public void addMoney(double moneyAmount) {
        if (getBalance() + moneyAmount > 10000) {
            displayMessage();
        } else {
            setBalance(getBalance() + moneyAmount);
        }
    }

    @Override
    public void takeMoney(double moneyAmount) throws NotEnoughFundsException {
        if (moneyAmount > getBalance()) {
            throw new NotEnoughFundsException("Insufficient funds");
        } else {
            setBalance(getBalance() - moneyAmount);
        }
    }

    @Override
    public void displayMessage() {
        System.out.println("Warning: Too much money");
    }
}
