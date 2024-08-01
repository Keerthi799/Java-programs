package Keerthi;

import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare variable vage (voting age limit)
        int vage = 18;

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read the age from the user

        // Compare age and vage
        if (age >= vage) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }

        // Close the Scanner object
        scanner.close();
    }
}