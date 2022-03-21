package io.codelex.classesandobjects.practice;

public class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public final void deposit(double amount) {
        balance += amount;
    }

    public final void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public String toString() {
        if (balance < 0) {
            return name
                    + ", -$" + String.format("%.2f", -1 * balance);
        } else {
            return name
                    + ", $" + String.format("%.2f", balance);
        }
    }

    public static void main(String[] args) {

        BankAccount benben = new BankAccount("Benson", 17.25);
        System.out.println(benben);

        BankAccount peterson = new BankAccount("Peterson", -17.5);
        System.out.println(peterson);
    }
}
