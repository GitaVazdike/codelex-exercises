package io.codelex.javaadvancedtest.exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card {

    public CreditCard(int cardNumber, String fullName, String ccvCode, BigDecimal balance) {
        super(cardNumber, fullName, ccvCode, balance);
    }

    @Override
    public void takeMoney(BigDecimal moneyAmount) throws NotEnoughFundsException {
        super.takeMoney(moneyAmount);
        if (getBalance().compareTo(BigDecimal.valueOf(100)) == -1) {
            displayMessage();
        }
    }

    @Override
    public void displayMessage() {
        System.out.println("Warning: Low funds");
    }
}
