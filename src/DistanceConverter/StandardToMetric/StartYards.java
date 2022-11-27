package DistanceConverter.StandardToMetric;

public class StartYards {
    public static void YardsToKilometers(double ValueToConvert) {
        double Kilometers = ValueToConvert / 1094;
        System.out.printf("%.2f in Yards is equal to %.2f in Kilometers", ValueToConvert, Kilometers);
    }
    public static void YardsToMeters(double ValueToConvert) {
        double Meters = ValueToConvert / 1.094;
        System.out.printf("%.2f in Yards is equal to %.2f in Meters", ValueToConvert, Meters);
    }
    public static void YardsToCentimeters(double ValueToConvert) {
        double Centimeters = ValueToConvert * 91.44;
        System.out.printf("%.2f in Yards is equal to %.2f in Centimeters", ValueToConvert, Centimeters);
    }
    public static void YardsToMillimeters(double ValueToConvert) {
        double Millimeters = ValueToConvert * 914.4;
        System.out.printf("%.2f in Yards is equal to %.2f in Millimeters", ValueToConvert, Millimeters);
    }
}
