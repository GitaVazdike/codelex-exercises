package io.codelex.oop.shapes;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5,6);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getHeight());
        System.out.println(rectangle.getNumSides());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Triangle triangle = new Triangle(7,6);
        System.out.println(triangle.getWidth());
        System.out.println(triangle.getHeight());
        System.out.println(triangle.getNumSides());
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }
}
