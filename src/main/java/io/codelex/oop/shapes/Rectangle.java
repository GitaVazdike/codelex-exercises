package io.codelex.oop.shapes;

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        super(4);
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
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return (width + height) * 2;
    }
}
