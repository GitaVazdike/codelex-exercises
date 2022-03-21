package io.codelex.oop.shapes2;

public class Triangle extends Shape {

    private double width;
    private double height;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculatePerimeter() {
        double hypotenuse = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        return width + height + hypotenuse;
    }

    @Override
    double calculateArea() {
        return width * height / 2;
    }
}
