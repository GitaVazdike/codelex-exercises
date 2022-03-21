package io.codelex.oop.shapes2;

public class Hexagon extends Shape {

    private double side;

    public Hexagon(double side) {
        this.side = side;
    }

    @Override
    double calculatePerimeter() {
        return side * 6;
    }

    @Override
    double calculateArea() {
        return ((3 * Math.sqrt(3)) / 2) * Math.pow(side, 2);
    }
}
