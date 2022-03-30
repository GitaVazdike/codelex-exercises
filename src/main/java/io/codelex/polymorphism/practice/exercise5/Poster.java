package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private String size;
    private int numberOfCopies;
    private int costPerDay;

    public Poster(int fee, String size, int numberOfCopies, int costPerDay) {
        super(fee);
        this.size = size;
        this.numberOfCopies = numberOfCopies;
        this.costPerDay = costPerDay;
    }

    public int cost() {
        return super.cost() + numberOfCopies * costPerDay;
    }

    public String toString() {
        return super.toString() + " Poster ad: size = " + size + " Number of copies = "
                + numberOfCopies + " Cost per Day = " + costPerDay;
    }
}
