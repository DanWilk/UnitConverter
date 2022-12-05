package DistanceConverter.MetricToMetric;

public class StartKilometers {
    public static void KilometersToMeters(double ValueToConvert) {
        double meters = ValueToConvert * 1000.00;
        System.out.printf("%.2f Kilometers is equal to %.2f Meters", ValueToConvert, meters);
    }

    public static void KilometersToCentimeters(double ValueToConvert) {
        double centimeters = ValueToConvert * 100000.00;
        System.out.printf("%.2f Kilometers is equal to %.2f Cemtimeters", ValueToConvert, centimeters);
    }

    public static void KilometersToMillimeters(double ValueToConvert) {
        double millimeters = ValueToConvert * 1000000.00;
        System.out.printf("%.2f Kilometers is equal to %.2f Millimeters", ValueToConvert, millimeters);
    }
}
