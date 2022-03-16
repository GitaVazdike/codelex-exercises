package io.codelex.oop.persons;

import java.time.LocalDate;

public class MainPerson {
    public static void main(String[] args) {

        Employee employee = new Employee("John", "Brown", "EMP001",
                40, "Accountant", LocalDate.of(2015, 3, 16));

        System.out.println(employee.getInfo());
        System.out.println(employee.getFirstName() + " " + employee.getLastName() + " age: " + employee.getAge());

        Customer customer = new Customer("Sally", "Fisherman", "CUS002", 25, 15);
        System.out.println(customer.getInfo());

        customer.setPurchaseCount(26);
        System.out.println(customer.getInfo());
    }
}
