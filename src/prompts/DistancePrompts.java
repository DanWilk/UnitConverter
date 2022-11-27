package prompts;

import DistanceConverter.StandardToMetric.StartMiles;

import java.util.Scanner;

public class DistancePrompts {
    public static void StandardToMetric(Scanner scanner) {
        System.out.println("Which measurement would you like to start with?");
        System.out.println("1. Miles");
        System.out.println("2. Yards");
        System.out.println("3. Feet");
        System.out.println("4. Inches");
        int FirstChoice = scanner.nextInt();

        if(FirstChoice == 1) {
            StartMiles(scanner);
        }

    }

    public static void StartMiles(Scanner scanner) {
        System.out.println("What would you like this value converted to?");
        System.out.println("1. Kilometers");
        System.out.println("2. Meters");
        System.out.println("3. Centimeters");
        System.out.println("4. Millimeters");

        int SecondChoice = scanner.nextInt();

        if(SecondChoice == 1) {
            System.out.println("please enter a value to convert");
            double Value = scanner.nextDouble();
            DistanceConverter.StandardToMetric.StartMiles.MilesToKilometers(Value);
        } else if(SecondChoice == 2) {
            System.out.println("please enter a value to convert");
            double Value = scanner.nextDouble();
            DistanceConverter.StandardToMetric.StartMiles.MilesToMeters(Value);
        } else if(SecondChoice == 3) {
            System.out.println("please enter a value to convert");
            double Value = scanner.nextDouble();
            DistanceConverter.StandardToMetric.StartMiles.MilesToCentimeters(Value);
        } else if(SecondChoice == 4) {
            System.out.println("please enter a value to convert");
            double Value = scanner.nextDouble();
            DistanceConverter.StandardToMetric.StartMiles.MilesToMillimeters(Value);
        }
    }
}
