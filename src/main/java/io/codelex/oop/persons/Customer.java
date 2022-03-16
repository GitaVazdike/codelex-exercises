package io.codelex.oop.persons;

public class Customer extends Person {
    private int purchaseCount;
    private String customerId;

    public Customer(String firstName, String lastName, String id, int age, int purchaseCount) {
        super(firstName, lastName, id, age);
        customerId = id;
        this.purchaseCount = purchaseCount;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    @Override
    String getInfo() {
        return getFirstName() + " " + getLastName() + " " + getId() + " (" + getPurchaseCount() + " purchases)";
    }
}
