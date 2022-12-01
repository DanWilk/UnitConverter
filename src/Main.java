import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the unit converter!");
        System.out.println("Please enter one of the following choices");

        System.out.println("1. Temperature Conversions");
        System.out.println("2. Distance Conversions");
        System.out.println("3. Mass to Weight Conversions");
        System.out.println("4. Speed Conversions");
        System.out.println("5. Exit Program");
        Scanner scanner = new Scanner(System.in);
        int UserChoice = scanner.nextInt();

        if(UserChoice == 1) {
            prompts.UserPrompts.tempPrompts(scanner);
        } else if(UserChoice == 2) {
            System.out.println("Which conversion would you like to make?");
            System.out.println("1. Standard To Metric");
            System.out.println("2. Metric to Standard");

            switch(scanner.nextInt()) {
                case 1:
                    prompts.DistancePrompts.StandardToMetric(scanner);
                    break;
                case 2:
                    prompts.DistancePrompts.MetricToStandard(scanner);
                    break;
                default:
                    System.out.println("invalid option");
                    break;
            }
        } else if(UserChoice == 3) {
            System.out.print("mass chosen");
        } else if(UserChoice == 4) {
            System.out.print("Speed chosen");
        } else if(UserChoice == 5) {
            System.out.print("Exiting ...");
            System.exit(0);
        }


    }
}