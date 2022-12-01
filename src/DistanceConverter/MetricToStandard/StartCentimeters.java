package DistanceConverter.MetricToStandard;

public class StartCentimeters {
    public static void CentimetersToMiles(double ValueToConvert) {
        double Miles = ValueToConvert / 160900.00;
        System.out.printf("%.2f Centimeters is equal to %.2f Miles", ValueToConvert, Miles);
    }

    public static void CentimetersToYards(double ValueToConvert) {
        double Yards = ValueToConvert / 91.44;
        System.out.printf("%.2f Centimeters is equal to %.2f Yards", ValueToConvert, Yards);
    }

    public static void CentimetersToFeet(double ValueToConvert) {
        double Feet = ValueToConvert / 30.48;
        System.out.printf("%.2f Centimeters is equal to %.2f Feet", ValueToConvert, Feet);
    }

    public static void CentimetersToInches(double ValueToConvert) {
        double Inches = ValueToConvert / 2.54;
        System.out.printf("%.2f Centimeters is equal to %.2f Inches", ValueToConvert, Inches);
    }
}
