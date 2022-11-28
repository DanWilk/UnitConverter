package DistanceConverter.StandardToMetric;

public class StartFeet {
    public static void FeetToKilometers(double ValueToConvert) {
        double Kilometers = ValueToConvert / 3281.00;
        System.out.printf("%.2f Feet is equal to %.2f Kilometers", ValueToConvert, Kilometers);
    }

    public static void FeetToMeters(double ValueToConvert) {
        double Meters = ValueToConvert / 3.281;
        System.out.printf("%.2f Feet is equal to %.2f Meters", ValueToConvert, Meters);
    }

    public static void FeetToCentimeters(double ValueToConvert) {
        double Centimeters = ValueToConvert * 30.48;
        System.out.printf("%.2f Feet is equal to %.2f Centimeters", ValueToConvert, Centimeters);
    }

    public static void FeetToMillimeters(double ValueToConvert) {
        double Millimeters = ValueToConvert * 304.8;
        System.out.printf("%.2f Feet is equal to %.2f Millimeters", ValueToConvert, Millimeters);
    }
}
