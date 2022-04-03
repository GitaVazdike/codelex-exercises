package io.codelex.javaadvancedtest.exercise2;


public class TestBasket {
    public static void main(String[] args) throws BasketFullException, BasketEmptyException {

        Apple apple = new Apple();
        Basket<Apple> appleBasket = new Basket<>();

        appleBasket.addToBasket(apple);
        appleBasket.addToBasket(apple);
        appleBasket.displayBasket();

        try {
            for (int i = 0; i < 10; i++) {
                appleBasket.addToBasket(apple);
            }
        } catch (BasketFullException e) {
            System.out.println("Basket is full");
        }

        Mushroom mushroom = new Mushroom();
        Basket<Mushroom> mushroomBasket = new Basket<>();

        mushroomBasket.addToBasket(mushroom);
        mushroomBasket.displayBasket();
        mushroomBasket.removeFromBasket(mushroom);

        try {
            mushroomBasket.removeFromBasket(mushroom);
        } catch (BasketEmptyException e) {
            System.out.println("Basket is empty");
        }

    }
}

