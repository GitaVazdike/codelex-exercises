package io.codelex.polymorphism.practice.exercise3;

public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private int id;

    public Person(String firstName, String lastName, String address, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void display() {
        System.out.printf("FirstName: %s, LastName: %s, Address: %s, ID: %d",
                firstName, lastName, address, id);
        System.out.println();
    }
}
