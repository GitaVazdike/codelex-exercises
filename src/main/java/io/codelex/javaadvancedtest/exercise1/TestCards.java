package io.codelex.javaadvancedtest.exercise1;

public class TestCards {
    public static void main(String[] args) throws NotEnoughFundsException {

        Card debitCard = new DebitCard(123456789, "Johny Depp", 456, 1500d);
        System.out.println(debitCard);

        debitCard.addMoney(100000);

        debitCard.addMoney(145.52);
        System.out.println(debitCard.getBalance());

        debitCard.takeMoney(589);
        System.out.println(debitCard.getBalance());

        debitCard.takeMoney(1500);

        Card creditCard = new CreditCard(987456321, "Anna Field", 123, 150d);
        System.out.println(creditCard);

        creditCard.takeMoney(100);

        creditCard.addMoney(145.52);
        System.out.println(debitCard.getBalance());

        creditCard.takeMoney(1500);

    }
}
