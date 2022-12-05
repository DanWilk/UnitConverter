package DistanceConverter.MetricToMetric;

public class StartMeters {
    public static void MetersToKilometers(double ValueToConvert) {
        double kilometers = ValueToConvert / 1000.00;
        System.out.printf("%.2f Meters is equal to %.2f Kilometers", ValueToConvert, kilometers);
    }

    public static void MetersToCentimeters(double ValueToConvert) {
        double centimeters = ValueToConvert * 100.00;
        System.out.printf("%.2f Meters is equal to %.2f Centimeters", ValueToConvert, centimeters);
    }

    public static void MetersToMillimeters(double ValueToConvert) {
        double millimeters = ValueToConvert * 1000.00;
        System.out.printf("%.2f Meters is equal to %.2f Millimeters", ValueToConvert, millimeters);
    }
}
