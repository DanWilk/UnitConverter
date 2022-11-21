package prompts;

import java.util.Scanner;

public class UserPrompts {
    public static void tempPrompts(Scanner scanner) {
        System.out.println("Please choose an option below");

        System.out.println("1. F to C");
        System.out.println("2. F to K");
        System.out.println("3. C to F");
        System.out.println("4. C to K");
        System.out.println("5. K to C");
        System.out.println("6. K to F");

        int tempChoice = scanner.nextInt();

        if(tempChoice == 1) {
            System.out.println("What temperature in Fahrenheit would you like to convert?");
            double chosenTemp = scanner.nextDouble();
            TempConverter.StartFahrenheit.toCelsius(chosenTemp);
        } else if(tempChoice == 2) {
            System.out.println("What temperature in Fahrenheit would you like to convert?");
            double chosenTemp = scanner.nextDouble();
            TempConverter.StartFahrenheit.toKelvin(chosenTemp);
        } else if(tempChoice == 3) {
            System.out.println("What temperature in Celsius would you like to convert?");
            double chosenTemp = scanner.nextDouble();
            TempConverter.StartCelsius.toFahrenheit(chosenTemp);
        } else if(tempChoice == 4) {
            System.out.println("What temperature in Celsius would you like to convert?");
            double chosenTemp = scanner.nextDouble();
            TempConverter.StartCelsius.toKelvin(chosenTemp);
        }
    }
}
