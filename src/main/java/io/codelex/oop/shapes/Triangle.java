package io.codelex.oop.shapes;

public class Triangle extends Shape {
    private int width;
    private int height;

    public Triangle(int width, int height) {
        super(3);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height / 2;
    }

    @Override
    public double getPerimeter() {
        double hypotenuse = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        return width + height + hypotenuse;
    }
}
