package Keerthi;

import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            System.out.print("Enter gender (male/female): ");
            String gender = scanner.next();
            System.out.print("Enter height (in meters): ");
            double height = scanner.nextDouble();
            System.out.print("Enter mass (in kilograms): ");
            double mass = scanner.nextDouble();

            //to calculate the BMI Using the formula
            
            double bmi = mass / (height * height);
            System.out.println("BMI: " + bmi);

            if (bmi < 18.5) {
                System.out.println("BMI category: Underweight"); //Under  weight
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                System.out.println("BMI category: Normal weight"); //Normal Weight
            } else if (bmi >= 25 && bmi <= 29.9) {
                System.out.println("BMI category: Overweight"); //Over weight
            } else {
                System.out.println("BMI category: Obesity"); //Obesity
            }

            System.out.print("Do you want to calculate BMI for another person? (yes/no): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y"));

        System.out.println("Exiting the program. Thank you!");
        scanner.close();
    }
}