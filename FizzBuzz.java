package Keerthi;

public class FizzBuzz {
    public static void main(String[] args) {
        // Loop through numbers from 1 to 50
        for (int i = 1; i <= 50; i++) {
            // Check if the number is a multiple of both 4 and 5
            if (i % 4 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Check if the number is a multiple of 4
            else if (i % 4 == 0) {
                System.out.println("Fizz");
            }
            // Check if the number is a multiple of 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Print the number if none of the above conditions are met
            else {
                System.out.println(i);
            }
        }
    }
}