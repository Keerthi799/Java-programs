package Keerthi;

import java.util.Scanner;

public class StudentMark {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[6];
        
        boolean Passed = true;
        
        int sum = 0;
        double percentage;

        // Taking input from the user
       
        
        System.out.println("Enter the marks for 6 subjects:");
        
        for (int i = 0; i < marks.length; i++) {
        	
            System.out.print("Mark " + (i + 1) + ": ");
            
            marks[i] = scanner.nextInt();
        }

        // Check if all marks are above 35
        
        for (int mark : marks) {
        	
            if (mark <= 35) {
                Passed = false;
            }
            sum += mark;
        }

        // Calculate and display results
        
        if (Passed) {
            percentage = (double) sum / marks.length;
            System.out.println("Student Result: Passed");
            System.out.println("Total = " + sum);
            System.out.println("Percentage = " + percentage);
        } 
        else {
            System.out.println("Student got Failed");
        }

        scanner.close();
    }
}
