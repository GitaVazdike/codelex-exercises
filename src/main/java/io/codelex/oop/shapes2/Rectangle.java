package io.codelex.oop.shapes2;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    double calculatePerimeter() {
        return (width + height) * 2;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}
