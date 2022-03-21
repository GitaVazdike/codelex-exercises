package io.codelex.oop.cars;

public class TestCar {
    public static void main(String[] args) {

        Car fordMustang = new Car("Ford", "Mustang GT Fastback", 40000D, 2021, EngineType.V8, new Manufacturer("Ford Motor Company", 1903, "USA"));

        System.out.println(fordMustang);

        fordMustang.addManufacturer(new Manufacturer("Stellantis", 2021, "USA"));

        System.out.println(fordMustang);
    }
}
