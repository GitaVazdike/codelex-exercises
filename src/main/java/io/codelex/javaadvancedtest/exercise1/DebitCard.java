package io.codelex.javaadvancedtest.exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card {

    public DebitCard(int cardNumber, String fullName, String ccvCode, BigDecimal balance) {
        super(cardNumber, fullName, ccvCode, balance);
    }

    @Override
    public void addMoney(BigDecimal moneyAmount) {
        super.addMoney(moneyAmount);
        if (getBalance().compareTo(BigDecimal.valueOf(10000)) == 1) {
            displayMessage();
        }
    }

    @Override
    public void displayMessage() {
        System.out.println("Warning: Too much money");
    }
}
