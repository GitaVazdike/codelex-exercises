package io.codelex.classesandobjects.practice.exercise_1;

public class ProductTest {
    public static void main(String[] args) {
        Product mouse = new Product("Logitech mouse", 70.00, 14);
        Product phone = new Product("iPhone 5s", 999.99, 3);
        Product projector = new Product("Epson EB-U05", 440.46, 1);

        mouse.printProduct();
        mouse.setPrice(65.00);
        mouse.printProduct();
        
        phone.printProduct();
        phone.setAmount(10);
        phone.printProduct();

        projector.printProduct();
        projector.setPrice(550.00);
        projector.setAmount(4);
        projector.printProduct();

    }
}
