package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Objects;

public class Car {
    private String name;
    private String model;
    private double price;
    private int yearOfManufacture;
    private EngineType engineType;
    private ArrayList<Manufacturer> manufacturerList = new ArrayList<>();


    public Car(String name, String model, double price, int yearOfManufacture,
               EngineType engineType, Manufacturer manufacturer) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.engineType = engineType;
        manufacturerList.add(manufacturer);
    }

    public void addManufacturer(Manufacturer manufacturer) {
        manufacturerList.add(manufacturer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public ArrayList<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }


    public EngineType getEngineType() {
        return engineType;
    }

    public boolean hasManufacturer(String titleOfManufacturer) {
        for (Manufacturer manufacturer : manufacturerList) {
            if (manufacturer.getName().equalsIgnoreCase(titleOfManufacturer)) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        for (Manufacturer m : manufacturerList) {
            System.out.println(m.getName() + " " + m.getYearOfEstablishment() + " " + m.getCountry());
        }
    }

    @Override
    public String toString() {
        return "Car{"
                + "name='" + name + '\''
                + ", model='" + model + '\''
                + ", price=" + price
                + ", yearOfManufacture=" + yearOfManufacture
                + ", engineType=" + engineType
                + ", manufacturerList=" + manufacturerList
                + "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Double.compare(car.getPrice(), getPrice()) == 0
                && getYearOfManufacture() == car.getYearOfManufacture()
                && getName().equals(car.getName())
                && getModel().equals(car.getModel())
                && getEngineType() == car.getEngineType()
                && getManufacturerList().equals(car.getManufacturerList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getModel(), getPrice(),
                getYearOfManufacture(), getEngineType(), getManufacturerList());
    }
}
