package DistanceConverter.StandardToMetric;

public class StartInches {
    public static void InchesToKilometers(double ValueToConvert) {
        double Kilometers = ValueToConvert / 39370;
        System.out.printf("%.2f Inches is equal to %.2f Kilometers", ValueToConvert, Kilometers);
    }

    public static void InchesToMeters(double ValueToConvert) {
        double Meters = ValueToConvert / 39.37;
        System.out.printf("%.2f Inches is equal to %.2f Meters", ValueToConvert, Meters);
    }

    public static void InchesToCentimeters(double ValueToConvert) {
        double Centimeters = ValueToConvert * 2.54;
        System.out.printf("%.2f Inches is equal to %.2f Centimeters", ValueToConvert, Centimeters);
    }

    public static void InchesToMillimeters(double ValueToConvert) {
        double Millimeters = ValueToConvert * 25.4;
        System.out.printf("%.2f Inches is equal to %.2f Millimeters", ValueToConvert, Millimeters);
    }
}
