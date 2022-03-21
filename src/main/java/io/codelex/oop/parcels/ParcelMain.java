package io.codelex.oop.parcels;

public class ParcelMain {
    public static void main(String[] args) {

        Parcel parcel = new Parcel(21, 45, 33, 16);
        Parcel parcel1 = new Parcel(105, 99, 102, 16);
        Parcel parcel2 = new Parcel(32, 45, 33, 36);
        Parcel parcel3 = new Parcel(32, 45, 33, 16);

        System.out.println("Parcel is valid: " + parcel.validate() + "\n");
        System.out.println("Parcel is valid: " + parcel1.validate() + "\n");
        System.out.println("Parcel is valid: " + parcel2.validate() + "\n");
        System.out.println("Parcel is valid: " + parcel3.validate() + "\n");
    }
}
