package Keerthi;

public class DigitSum {
    public static void main(String[] args) {
        int number = 38154;
        int sum = getSingleDigitSum(number);
        System.out.println("Single digit sum: " + sum);
    }

    // Method to get the single-digit sum of a number
    public static int getSingleDigitSum(int num) {
        // Continue looping until num is a single-digit number
        while (num >= 10) {
            int sum = 0;
            // Calculate the sum of digits
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum; // Update num with the sum
        }
        return num; // Return the single-digit sum
    }
}