package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CarService {
    ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public ArrayList<Car> getV12engineCars() {
        ArrayList<Car> carsV12 = new ArrayList<>();
        for (Car car : cars) {
            if (car.getEngineType() == EngineType.V12) {
                carsV12.add(car);
            }
        }
        return carsV12;
    }

    public ArrayList<Car> getCarsProducedBefore1999() {
        ArrayList<Car> carsBefore1999 = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYearOfManufacture() < 1999) {
                carsBefore1999.add(car);
            }
        }
        return carsBefore1999;
    }

    public Car getMostExpensiveCar() {
        cars.sort(Comparator.comparing(Car::getPrice));
        return cars.get(cars.size() - 1);
    }

    public Car getCheapestCar() {
        cars.sort(Comparator.comparing(Car::getPrice));
        return cars.get(0);
    }

    public ArrayList<Car> getCarsWithAtLeastThreeManufacturers() {
        ArrayList<Car> carList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getManufacturerList().size() >= 3) {
                carList.add(car);
            }
        }
        return carList;
    }

    public ArrayList<Car> sortCarsByName(String parameter) {
        if (parameter.equalsIgnoreCase("ascending")) {
            cars.sort(Comparator.comparing(Car::getName));
        } else if (parameter.equalsIgnoreCase("descending")) {
            cars.sort(Comparator.comparing(Car::getName).reversed());
        }
        return cars;
    }

    public boolean isCarOnTheList(String name) {
        boolean carIsOnTheList = false;

        for (Car car : cars) {
            if (name.equalsIgnoreCase(car.getName())) {
                carIsOnTheList = true;
                break;
            }
        }
        return carIsOnTheList;
    }

    public ArrayList<Car> getCarsByManufacturer(String titleOfManufacturer) {
        ArrayList<Car> carsWithOneManufacturer = new ArrayList<>();
        for (Car car : cars) {
            for (Manufacturer manufacturer : car.getManufacturerList()) {
                if (manufacturer.getName().equalsIgnoreCase(titleOfManufacturer)) {
                    carsWithOneManufacturer.add(car);
                }
            }
        }
        return carsWithOneManufacturer;
    }

    public ArrayList<Car> getCarsByManufacturerYear(String operator, int year) {
        ArrayList<Car> carList = new ArrayList<>();
        for (Car car : cars) {
            for (Manufacturer manufacturer : car.getManufacturerList()) {
                switch (operator) {
                    case "<":
                        if (manufacturer.getYearOfEstablishment() < year) {
                            carList.add(car);
                        }
                        break;
                    case ">":
                        if (manufacturer.getYearOfEstablishment() > year) {
                            carList.add(car);
                        }
                        break;
                    case "<=":
                        if (manufacturer.getYearOfEstablishment() <= year) {
                            carList.add(car);
                        }
                        break;
                    case ">=":
                        if (manufacturer.getYearOfEstablishment() >= year) {
                            carList.add(car);
                        }
                        break;
                    case "=":
                        if (manufacturer.getYearOfEstablishment() == year) {
                            carList.add(car);
                        }
                        break;
                    case "!=":
                        if (manufacturer.getYearOfEstablishment() != year) {
                            carList.add(car);
                        }
                        break;
                }
            }
        }
        return carList;
    }
}

