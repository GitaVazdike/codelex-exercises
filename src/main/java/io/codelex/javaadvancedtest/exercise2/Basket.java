package io.codelex.javaadvancedtest.exercise2;

import io.codelex.javaadvancedtest.exercise1.NotEnoughFundsException;

public class Basket<T> {
    private T items;
    private int numberOfItems = 0;

    public Basket(T items) {
        this.items = items;
    }

    public T getItems() {
        return items;
    }

    public void setItems(T items) {
        this.items = items;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public void addToBasket() throws BasketFullException {
        if (numberOfItems > 10) {
            throw new BasketFullException("Basket is full");
        } else {
            numberOfItems++;
        }
    }

    public void removeFromBasket() throws BasketEmptyException {
        if (numberOfItems < 0) {
            throw new BasketEmptyException("Basket is empty");
        } else {
            numberOfItems--;
        }
    }

    public void displayBasket() {
        System.out.printf("Item in basket: " + items
                + ". Number of items: " + numberOfItems + "\n");
    }
}


