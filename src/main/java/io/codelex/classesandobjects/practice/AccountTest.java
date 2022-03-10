package io.codelex.classesandobjects.practice;

public class AccountTest {
    public static void main(String[] args) {

        Account accountBarto = new Account("Barto's account", 100.0);
        accountBarto.deposit(20.0);
        System.out.println(accountBarto);

        Account accountMatt = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0);

        accountMatt.withdrawal(100);
        myAccount.deposit(100);

        System.out.println(accountMatt);
        System.out.println(myAccount);

        Account A = new Account("A", 100.0);
        Account B = new Account("B", 0.0);
        Account C = new Account("C", 0.0);

        System.out.println("Initial state:\n" + A + "\n" + B + "\n" + C);

        Account.transfer(A, B, 50.0);
        Account.transfer(B, C, 25.0);

        System.out.println("A account balance is now: " + A.balance());
        System.out.println("B account balance is now: " + B.balance());
        System.out.println("C account balance is now: " + C.balance());
    }
}
