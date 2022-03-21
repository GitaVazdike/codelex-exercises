package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public class ImperialToMetricApp {
    public static void main(String[] args) {
        BigDecimal valueToConvert = new BigDecimal("10.5");
        BigDecimal result = MeasurementConverter.convert(ConversionType.CENTIMETERS_TO_INCHES, valueToConvert);
        System.out.println(result);

        BigDecimal valueToConvert2 = new BigDecimal("22.0");
        BigDecimal result2 = MeasurementConverter.convert(ConversionType.KILOMETERS_TO_MILES, valueToConvert2);
        System.out.println(result2);
    }
}
