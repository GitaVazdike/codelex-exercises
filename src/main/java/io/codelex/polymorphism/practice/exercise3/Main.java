package io.codelex.polymorphism.practice.exercise3;

public class Main {
    public static void main(String[] args) {

        Person student = new Student("Andrew", "Fisherman", "Oak Street 15", 351, 7.8);
        student.display();

        Person employee = new Employee("Harry", "Anderson", "Daisy Street 10", 457, "plumber");
        employee.display();
    }
}
