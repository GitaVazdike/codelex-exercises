package io.codelex.oop.computers;

public class Test {
    public static void main(String[] args) {
        Computer computer1 = new Computer(" Intel Core i5-11400H", "16 GB", "NVIDIA GeForce RTX 3050 Ti", "Asus", "TUF Gaming F15 FX506HEB");
        Computer computer2 = new Computer("AMD Ryzen 5 5600H", "8 GB", "NVIDIA GeForce RTX 3050", "Lenovo", "IdeaPad Gaming 3 15ACH6");
        Computer computer3 = new Computer("Intel Core i7-11800H", "16 GB", "NVIDIA GeForce RTX 3060", "Hewlett Packard", "Victus 16-d0175nw");

        System.out.println(computer1);

        computer1.setRam("8 GB");
        System.out.println(computer1.getRam());
        System.out.println(computer2.getCompany());
        System.out.println(computer3.getGraphicsCard());

        Laptop laptop1 = new Laptop("AMD Ryzen 3 3250U", "8 GB", "AMD Radeon Vega 3", "Lenovo", "IdeaPad 3 14ADA05", "Battery No. 1");

        laptop1.setRam("16 GB");
        System.out.println(laptop1.getRam());
        System.out.println(laptop1.getBattery());
        System.out.println(laptop1.getGraphicsCard());

    }
}
