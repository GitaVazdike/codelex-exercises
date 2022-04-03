package io.codelex.javaadvancedtest.exercise1;

import java.math.BigDecimal;

public class TestCards {
    public static void main(String[] args) throws NotEnoughFundsException {

        Card debitCard = new DebitCard(123456789, "Johny Depp", "456", BigDecimal.valueOf(1500));
        System.out.println(debitCard);

        debitCard.addMoney(BigDecimal.valueOf(145.52));
        System.out.println(debitCard.getBalance());

        debitCard.addMoney(BigDecimal.valueOf(100000));

        try {
            debitCard.takeMoney(BigDecimal.valueOf(589));
            System.out.println(debitCard.getBalance());

            Card creditCard = new CreditCard(987456321, "Anna Field", "023", BigDecimal.valueOf(150));
            System.out.println(creditCard);

            creditCard.takeMoney(BigDecimal.valueOf(100));

            creditCard.addMoney(BigDecimal.valueOf(145.52));
            System.out.println(creditCard.getBalance());

            creditCard.takeMoney(BigDecimal.valueOf(1500));
        } catch (NotEnoughFundsException e) {
            System.out.println("Insufficient funds " + e);
        }

    }
}
