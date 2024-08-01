package Keerthi;

class CurrentAccount extends Account {
	
	double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void displayBalance() {
        System.out.println("Balance of current account " + accountNumber + ": " + balance + " (Overdraft limit: " + overdraftLimit + ")");
    }
 

    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("SA001", 5000, 5.0);
        CurrentAccount currentAccount = new CurrentAccount("CA001", 3000, 2000);

        savingAccount.deposit(1000);
        savingAccount.withdraw(200);
        savingAccount.displayBalance();

        currentAccount.deposit(2000);
        currentAccount.withdraw(4000);
        currentAccount.displayBalance();
    }
}