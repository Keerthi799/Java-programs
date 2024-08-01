package Keerthi;
import java.util.Scanner;

public class Withdrawal {
	
    public static void main(String[] args) {
    	
        int dailyWithdrawalLimit = 5000; 
        int totalWithdrawn = 0; 
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter amount to withdraw (or 0 to exit): ");
            int amountToWithdraw = scanner.nextInt();
            
            if (amountToWithdraw == 0) {
                System.out.println("Exiting...");
                break; 
            }
            
            if (totalWithdrawn + amountToWithdraw > dailyWithdrawalLimit) {
                System.out.println("Daily withdrawal limit exceeded. Exiting...");
                break; 
            }
            
            totalWithdrawn += amountToWithdraw;
            System.out.println("Amount withdrawn: " + amountToWithdraw);
            System.out.println("Total withdrawn today: " + totalWithdrawn);
        }
        
        scanner.close();
    }
}