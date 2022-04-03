package io.codelex.javaadvancedtest.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private List<T> items = new ArrayList<>();
    private int numberOfItems = 0;

    public void addToBasket(T item) throws BasketFullException {
        if (numberOfItems >= 10) {
            throw new BasketFullException("Basket is full");
        }
        items.add(item);
        numberOfItems++;
    }

    public void removeFromBasket(T item) throws BasketEmptyException {
        if (numberOfItems <= 0) {
            throw new BasketEmptyException("Basket is empty");
        } else {
            items.remove(item);
            numberOfItems--;
        }
    }

    public void displayBasket() {
        System.out.println("Content of basket: " + items
                + ". Number of items: " + numberOfItems + "\n");
    }

}


