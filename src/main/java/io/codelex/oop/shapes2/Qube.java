package io.codelex.oop.shapes2;

public class Qube extends Shape3D {

    private double side;

    public Qube(double side) {
        this.side = side;
    }

    @Override
    double calculatePerimeter() {
        return side * 12;
    }

    @Override
    double calculateArea() {
        return Math.pow(side, 2) * 6;
    }

    @Override
    double calculateVolume() {
        return Math.pow(side, 3);
    }
}
