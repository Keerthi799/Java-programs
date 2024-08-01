package Keerthi;

import java.util.Scanner;

public class Operations {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a x value :");
		System.out.println("Enter a y value :");
	
       	int x = sc.nextInt();
		
		 int y = sc.nextInt();
		
		System.out.println("Arthimatic operations : ");
		
		int sum = x+y;
		System.out.println("Sum of X and Y is :"+sum);
		
		int difference = x-y;
		System.out.println("Difference of X and Y is : "+difference);
		
		int multiplication = x*y;
		System.out.println("Multiplication of X and Y is :"+multiplication);
		
		int division = x/y;
		System.out.println("Divison of x and y is :"+division);
		
		sc.close();
		
		
	}

}
