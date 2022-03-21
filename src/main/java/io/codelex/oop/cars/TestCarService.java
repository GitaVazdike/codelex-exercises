package io.codelex.oop.cars;

public class TestCarService {
    public static void main(String[] args) {

        CarService carService = new CarService();

        Car fordMustang = new Car("Ford", "Mustang GT Fastback", 40000D, 2021, EngineType.V8, new Manufacturer("Ford Motor Company", 1903, "USA"));
        fordMustang.addManufacturer(new Manufacturer("Stellantis", 2021, "USA"));
        fordMustang.addManufacturer(new Manufacturer("Manufacturer1", 2002, "USA"));
        fordMustang.addManufacturer(new Manufacturer("Manufacturer2", 1995, "Italy"));

        Car toyota = new Car("Toyota", "Century", 10500D, 1998, EngineType.V12, new Manufacturer("Toyota Motor Corporation", 1937, "Japan"));
        toyota.addManufacturer(new Manufacturer("Manufacturer1", 2021, "USA"));
        toyota.addManufacturer(new Manufacturer("Manufacturer 3", 1960, "Germany"));

        Car bmw = new Car("BMW", "118", 4000D, 2005, EngineType.S6, new Manufacturer("BMW Group", 1916, "Germany"));
        Car audi = new Car("Audi", "S3", 4500D, 1999, EngineType.S3, new Manufacturer("Volkswagen Group", 1937, "Germany"));
        Car lexus = new Car("Lexus", "LS 460", 10000D, 2008, EngineType.V8, new Manufacturer("Toyota Motor Corporation", 1937, "Japan"));


        carService.addCar(fordMustang);
        carService.addCar(toyota);
        carService.addCar(bmw);
        carService.addCar(audi);
        carService.addCar(lexus);

        carService.removeCar(audi);

        System.out.println("List of all cars: \n" + carService.getCars() + "\n");
        System.out.println("Cars with V12 engine: \n" + carService.getV12engineCars() + "\n");
        System.out.println("Cars produced before 1999: \n" + carService.getCarsProducedBefore1999() + "\n");
        System.out.println("The most expensive car is: \n" + carService.getMostExpensiveCar() + "\n");
        System.out.println("The cheapest car is: \n" + carService.getCheapestCar() + "\n");
        System.out.println("Cars with 3 or more manufacturers: \n" + carService.getCarsWithAtLeastThreeManufacturers() + "\n");
        System.out.println("Car list in ascending order (sorted by name): \n" + carService.sortCarsByName("ascending") + "\n");
        System.out.println("Car list in descending order (sorted by name): \n" + carService.sortCarsByName("descending") + "\n");
        System.out.println("Car is on the list: \n" + carService.isCarOnTheList("bmw") + "\n");
        System.out.println("Cars with the same manufacturer: \n" + carService.getCarsByManufacturer("Toyota Motor Corporation") + "\n");
        System.out.println("Cars manufactured by the manufacturer with the year of establishment: \n" + carService.getCarsByManufacturerYear("=", 2021));
    }
}
