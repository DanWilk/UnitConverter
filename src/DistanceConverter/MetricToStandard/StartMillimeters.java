package DistanceConverter.MetricToStandard;

public class StartMillimeters {
    public static void MillimetersToMiles(double ValueToConvert) {
        double Miles = ValueToConvert / 1609000.00;
        System.out.printf("%.2f Millimeters is equal to %.2f Miles", ValueToConvert, Miles);
    }

    public static void MillimetersToYards(double ValueToConvert) {
        double Yards = ValueToConvert / 914.4;
        System.out.printf("%.2f Millimeters is equal to %.2f Yards", ValueToConvert, Yards);
    }

    public static void MillimetersToFeet(double ValueToConvert) {
        double Feet = ValueToConvert / 304.8;
        System.out.printf("%.2f Millimeters is equal to %.2f Feet", ValueToConvert, Feet);
    }

    public static void MillimetersToInches(double ValueToConvert) {
        double Inches = ValueToConvert / 25.4;
        System.out.printf("%.2f Millimeters is equal to %.2f Inches", ValueToConvert, Inches);
    }
}
