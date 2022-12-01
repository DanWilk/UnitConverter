package DistanceConverter.MetricToStandard;

public class StartKilometers {
    public static void KilometersToMiles(double ValueToConvert) {
        double Miles = ValueToConvert / 1.609;
        System.out.printf("%.2f Kilometers is equal to %.2f Miles", ValueToConvert, Miles);
    }

    public static void KilometersToYards(double ValueToConvert) {
        double Yards = ValueToConvert * 1094.00;
        System.out.printf("%.2f Kilometers is equal to %.2f Yards", ValueToConvert, Yards);
    }

    public static void KilometersToFeet(double ValueToConvert) {
        double Feet = ValueToConvert * 3281.00;
        System.out.printf("%.2f Kilometers is equal to %.2f Feet", ValueToConvert, Feet);
    }

    public static void KilometersToInches(double ValueToConvert) {
        double Inches = ValueToConvert * 39370.00;
        System.out.printf("%.2f Kilometers is equal to %.2f Inches", ValueToConvert, Inches);
    }
}