package io.codelex.oop.shapes2;

public class Cone extends Shape3D {

    private double height;
    private double radius;

    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    private double calculateBaseArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double calculateArea() {

        double sidesArea = Math.PI * radius * height;
        return calculateBaseArea() + sidesArea;
    }

    @Override
    double calculateVolume() {
        return calculateBaseArea() * height / 3;


    }
}
