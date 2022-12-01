package DistanceConverter.MetricToStandard;

public class StartMeters {
    public static void MetersToMiles(double ValueToConvert) {
        double Miles = ValueToConvert / 1609.00;
        System.out.printf("%.2f Meters is equal to %.2f Miles", ValueToConvert, Miles);
    }

    public static void MetersToYards(double ValueToConvert) {
        double Yards = ValueToConvert * 1.094;
        System.out.printf("%.2f Meters is equal to %.2f Yards", ValueToConvert, Yards);
    }

    public static void MetersToFeet(double ValueToConvert) {
        double Feet = ValueToConvert * 3.281;
        System.out.printf("%.2f Meters is equal to %.2f Feet", ValueToConvert, Feet);
    }

    public static void MetersToInches(double ValueToConvert) {
        double Inches = ValueToConvert * 39.37;
        System.out.printf("%.2f Meters is equal to %.2f inches");
    }
}
