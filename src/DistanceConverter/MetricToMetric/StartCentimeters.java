package DistanceConverter.MetricToMetric;

public class StartCentimeters {
    public static void CentimetersToKilometers(double ValueToConvert) {
        double kilometers = ValueToConvert / 100000.00;
        System.out.printf("%.2f Centimeters is equal to %.2f Kilometers", ValueToConvert, kilometers);
    }

    public static void MetersToCentimeters(double ValueToConvert) {
        double meters = ValueToConvert / 100.00;
        System.out.printf("%.2f Centimeters is equal to %.2f Meters", ValueToConvert, meters);
    }

    public static void MillimetersToCentimeters(double ValueToConvert) {
        double millimeters = ValueToConvert * 10.00;
        System.out.printf("%.2f Centimeters is equal to %.2f Millimeters", ValueToConvert, millimeters);
    }

}
