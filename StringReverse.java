package Keerthi;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // enter a string
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Reverse the string
        String reversedString = reverseString(input);

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }

    // Method to reverse the string
    public static String reverseString(String str) {
        int length = str.length();
        String reversed = " ";

        // Iterate  the string 
        for (int i = length - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }
}