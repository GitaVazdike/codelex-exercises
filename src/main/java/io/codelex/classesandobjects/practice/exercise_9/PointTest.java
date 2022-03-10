package io.codelex.classesandobjects.practice.exercise_9;

public class PointTest {
    public static void main(String[] args) {

        Point p1 = new Point(5, 2);
        Point p2 = new Point(-3, 6);

        swapPoints(p1, p2);
        System.out.println("Points after swap:\n(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");
    }

    private static void swapPoints(Point p1, Point p2) {
        int temporaryX = p1.getX();
        int temporaryY = p1.getY();

        p1.setX(p2.x);
        p1.setY(p2.y);

        p2.setX(temporaryX);
        p2.setY(temporaryY);
    }
}
