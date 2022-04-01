package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    final float MAX_WEIGHT = 30.0f;
    final int MAX_SUM_OF_DIMENSIONS = 300;
    final int MIN_SIZE = 30;

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
        if (weight > MAX_WEIGHT) {
            isExpress = false;
            System.out.println("Maximum weight exceeded!");
            return false;
        }

        if (parcelExceedsLimit()) {
            System.out.println("Sum of dimensions exceeds limit!");
            return false;
        }

        if (parcelTooSmall()) {
            System.out.println("Each size is not >= 30");
            return false;
        }
        return true;
    }

    private boolean parcelTooSmall() {
        return (xLength < MIN_SIZE || yLength < MIN_SIZE || zLength < MIN_SIZE);
    }
    private boolean parcelExceedsLimit() {
        return (xLength + yLength + zLength > MAX_SUM_OF_DIMENSIONS);
    }
}
