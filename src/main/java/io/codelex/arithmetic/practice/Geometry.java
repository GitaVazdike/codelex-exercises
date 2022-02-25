package io.codelex.arithmetic.practice;

import java.math.BigDecimal;

class Geometry {
    static double areaOfCircle(BigDecimal radius) {

        if (radius.signum() == -1) {
            throw new RuntimeException("Radius cannot be negative.");
        }

        BigDecimal circleArea = BigDecimal.valueOf(Math.PI).multiply(radius).multiply(BigDecimal.valueOf(2));
        return circleArea.doubleValue();
    }

    static double areaOfRectangle(BigDecimal length, BigDecimal width) {
        if (length.signum() == -1) {
            throw new RuntimeException("Length cannot be negative.");
        } else if (width.signum() == -1) {
            throw new RuntimeException("Width cannot be negative.");
        }

        BigDecimal rectangleArea = length.multiply(width);
        return rectangleArea.doubleValue();
    }

    static double areaOfTriangle(BigDecimal base, BigDecimal h) {
        if (base.signum() == -1) {
            throw new RuntimeException("Base cannot be negative.");
        } else if (h.signum() == -1) {
            throw new RuntimeException("Height cannot be negative.");
        }

        BigDecimal triangleArea = base.multiply(h).multiply(BigDecimal.valueOf(0.5));
        return triangleArea.doubleValue();
    }
}
