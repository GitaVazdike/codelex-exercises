package io.codelex.oop.parcels;

public class Parcel implements Validatable {

    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
    }

    @Override
    public boolean validate() {
        float MAX_WEIGHT = 30.0f;
        if (weight > MAX_WEIGHT) {
            isExpress = false;
            System.out.println("Maximum weight exceeded!");
            return false;
        }
        int MAX_SUM_OF_DIMENSIONS = 300;
        if (xLength + yLength + zLength > MAX_SUM_OF_DIMENSIONS) {
            System.out.println("Sum of dimensions exceeds limit!");
            return false;
        }
        int MIN_SIZE = 30;
        if (xLength < MIN_SIZE || yLength < MIN_SIZE || zLength < MIN_SIZE) {
            System.out.println("Each size is not >= 30");
            return false;
        }
        return true;
    }
}
