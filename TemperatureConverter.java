package Keerthi;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter temperature in Celsius: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numerical value.");
                scanner.next(); // consume the invalid input
            }
            double celsius = scanner.nextDouble();

            double fahrenheit = (9.0 / 5.0) * celsius + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);

            String category;
            if (fahrenheit < 32) {
                category = "Very cold";
            } else if (fahrenheit >= 32 && fahrenheit < 50) {
                category = "Cold";
            } else if (fahrenheit >= 50 && fahrenheit < 70) {
                category = "Mild";
            } else {
                category = "Warm";
            }
            System.out.println("Temperature category: " + category);

            System.out.print("Do you want to convert another temperature? (yes/no): ");
            choice = scanner.next().toLowerCase();
        } while (choice.equals("yes") || choice.equals("y"));

        System.out.println("Exiting the program. Thank you!");
        scanner.close();
    }
}