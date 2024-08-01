package Keerthi;

public class Account {
	
     String accountNumber;
     double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into account " + accountNumber);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from account " + accountNumber);
        } 
        else {
            System.out.println("Insufficient balance");
        }
    }

    public void displayBalance() {
        System.out.println("Balance of account " + accountNumber + ": " + balance);
    }
}