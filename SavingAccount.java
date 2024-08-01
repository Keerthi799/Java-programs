package Keerthi;

class SavingAccount extends Account {
	
    double interestRate;

   public SavingAccount(String accountNumber, double balance, double interestRate) {
       super(accountNumber, balance);
       this.interestRate = interestRate;
   }

   @Override
   public void displayBalance() {
       double totalBalance = balance + (balance * interestRate / 100);
       System.out.println("Total balance of saving account " + accountNumber + ": " + totalBalance);
   }
}

