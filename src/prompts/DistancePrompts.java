package prompts;



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
        } else if(FirstChoice == 2) {
            StartYards(scanner);
        } else if(FirstChoice == 3) {
            StartFeet(scanner);
        } else if(FirstChoice == 4) {
            StartInches(scanner);
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

    public static void StartYards(Scanner scanner) {
        System.out.println("What would you like this value converted to?");
        System.out.println("1. Kilometers");
        System.out.println("2. Meters");
        System.out.println("3. Centimeters");
        System.out.println("4. Millimeters");

        int SecondChoice = scanner.nextInt();

        if(SecondChoice == 1) {
            System.out.println("please enter a value to convert");
            double Value = scanner.nextDouble();
            DistanceConverter.StandardToMetric.StartYards.YardsToKilometers(Value);
        } else if(SecondChoice == 2) {
            System.out.println("please enter a value to convert");
            double Value = scanner.nextDouble();
            DistanceConverter.StandardToMetric.StartYards.YardsToMeters(Value);
        } else if(SecondChoice == 3) {
            System.out.println("please enter a value to convert");
            double Value = scanner.nextDouble();
            DistanceConverter.StandardToMetric.StartYards.YardsToCentimeters(Value);
        } else if(SecondChoice == 4) {
            System.out.println("please enter a value to convert");
            double Value = scanner.nextDouble();
            DistanceConverter.StandardToMetric.StartYards.YardsToMillimeters(Value);
        }
    }

    public static void StartFeet(Scanner scanner) {
        System.out.println("What would you like this value converted to?");
        System.out.println("1. Kilometers");
        System.out.println("2. Meters");
        System.out.println("3. Centimeters");
        System.out.println("4. Millimeters");

        int SecondChoice = scanner.nextInt();

        if(SecondChoice == 1) {
            System.out.println("please enter a value to convert");
            double Value = scanner.nextDouble();
            DistanceConverter.StandardToMetric.StartFeet.FeetToKilometers(Value);
        } else if(SecondChoice == 2) {
            System.out.println("please enter a value to convert");
            double Value = scanner.nextDouble();
            DistanceConverter.StandardToMetric.StartFeet.FeetToMeters(Value);
        } else if(SecondChoice == 3) {
            System.out.println("please enter a value to convert");
            double Value = scanner.nextDouble();
            DistanceConverter.StandardToMetric.StartFeet.FeetToCentimeters(Value);
        } else if(SecondChoice == 4) {
            System.out.println("please enter a value to convert");
            double Value = scanner.nextDouble();
            DistanceConverter.StandardToMetric.StartFeet.FeetToMillimeters(Value);
        }
    }

    public static void StartInches(Scanner scanner) {
        System.out.println("What would you like this value converted to?");
        System.out.println("1. Kilometers");
        System.out.println("2. Meters");
        System.out.println("3. Centimeters");
        System.out.println("4. Millimeters");

        int SecondChoice = scanner.nextInt();

        if(SecondChoice == 1) {
            System.out.println("please enter a value to convert");
            double Value = scanner.nextDouble();
            DistanceConverter.StandardToMetric.StartInches.InchesToKilometers(Value);
        } else if(SecondChoice == 2) {
            System.out.println("please enter a value to convert");
            double Value = scanner.nextDouble();
            DistanceConverter.StandardToMetric.StartInches.InchesToMeters(Value);
        } else if(SecondChoice == 3) {
            System.out.println("please enter a value to convert");
            double Value = scanner.nextDouble();
            DistanceConverter.StandardToMetric.StartInches.InchesToCentimeters(Value);
        } else if(SecondChoice == 4) {
            System.out.println("please enter a value to convert");
            double Value = scanner.nextDouble();
            DistanceConverter.StandardToMetric.StartInches.InchesToMillimeters(Value);
        }
    }
}
