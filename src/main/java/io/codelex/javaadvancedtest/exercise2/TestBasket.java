package io.codelex.javaadvancedtest.exercise2;

public class TestBasket {
    public static void main(String[] args) throws BasketFullException, BasketEmptyException {

        Apple apple = new Apple();
        Basket<Apple> appleBasket = new Basket<>(apple);

        appleBasket.addToBasket();
        appleBasket.displayBasket();

        for (int i = 1; i <= 10; i++) {
            appleBasket.addToBasket();
        }

        Mushroom mushroom = new Mushroom();
        Basket<Mushroom> mushroomBasket = new Basket<>(mushroom);

        mushroomBasket.addToBasket();
        mushroomBasket.displayBasket();

        mushroomBasket.removeFromBasket();
        mushroomBasket.removeFromBasket();
        mushroomBasket.displayBasket();
    }
}
