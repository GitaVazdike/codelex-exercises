package io.codelex.classesandobjects.practice.exercise_1;

public class Product {
    private String name;
    private double price;
    private int amount;

    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        price = priceAtStart;
        amount = amountAtStart;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void setAmount(int newAmount) {
        this.amount = newAmount;
    }

    public void printProduct() {
        System.out.println(name + ", price " + price + ", amount " + amount);
    }
}

