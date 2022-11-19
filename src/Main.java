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
            System.out.print("temp chosen");
        } else if(UserChoice == 2) {
            System.out.print("dist chosen");
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