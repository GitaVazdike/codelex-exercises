package io.codelex.oop.shapes2;

public class ShapeTest {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(5,7);
        System.out.println(triangle.calculatePerimeter());
        System.out.println(triangle.calculateArea());

        Rectangle rectangle = new Rectangle(4,6);
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateArea());

        Hexagon hexagon = new Hexagon(5);
        System.out.println(hexagon.calculatePerimeter());
        System.out.println(hexagon.calculateArea());

        Qube qube = new Qube(4);
        System.out.println(qube.calculatePerimeter());
        System.out.println(qube.calculateArea());
        System.out.println(qube.calculateVolume());

        Cone cone = new Cone(10,8);
        System.out.println(cone.calculatePerimeter());
        System.out.println(cone.calculateArea());
        System.out.println(cone.calculateVolume());

    }
}
