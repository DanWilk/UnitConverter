package DistanceConverter.StandardToMetric;

public class StartMiles {
    public static void MilesToKilometers(double ValueToConvert) {
        double Kilometers = ValueToConvert * 1.609;
        System.out.printf("%.2f in Miles is equal to %.2f in Kilometers.", ValueToConvert, Kilometers);
    }

    public static void MilesToMeters(double ValueToConvert) {
        double Meters = (ValueToConvert * 1609.00);
        System.out.printf("%.2f in Miles is equal to %.2f in Meters.", ValueToConvert, Meters);
    }

    public static void MilesToCentimeters(double ValueToConvert) {
        double Centimeters = ValueToConvert * 160900.00;
        System.out.printf("%.2f in Miles is equal to %.2f in Centimeters.", ValueToConvert, Centimeters);
    }
    public static void MilesToMillimeters(double ValueToConvert) {
        double Millimeters = ValueToConvert * 1609000.00;
        System.out.printf("%.2f in Miles is equal to %.2f in Millimeters.", ValueToConvert, Millimeters);
    }
}
