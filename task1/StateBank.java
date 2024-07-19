package task1;

public class StateBank {

	public static void main(String[] args) {
		 
	     BankAccount savingsAccount = new SavingsAccount();
	     savingsAccount.deposit(1000); 
	     savingsAccount.displayBalance();
	     savingsAccount.withdraw(500); 
	     savingsAccount.displayBalance(); 

	     System.out.println();

	     BankAccount currentAccount = new CurrentAccount();
	     currentAccount.deposit(2000); 
	     currentAccount.displayBalance(); 
	     currentAccount.withdraw(1500);
	     currentAccount.displayBalance(); 

	}

}

abstract class BankAccount {
 protected double balance;

 
 public abstract void deposit(double amount);
 public abstract void withdraw(double amount);

 
 public void displayBalance() {
     System.out.println("Current Balance: $" + balance);
 }
}


class SavingsAccount extends BankAccount {
 
 @Override
 public void deposit(double amount) {
     balance += amount;
     System.out.println("$" + amount + " deposited into Savings Account.");
 }

 
 @Override
 public void withdraw(double amount) {
     if (balance >= amount) {
         balance -= amount;
         System.out.println("$" + amount + " withdrawn from Savings Account.");
     } else {
         System.out.println("Insufficient funds in Savings Account.");
     }
 }
}


class CurrentAccount extends BankAccount {
 
 @Override
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Rs." + amount + " deposited into Current Account.");
 }

 
 @Override
 public void withdraw(double amount) {
     if (balance >= amount) {
         balance -= amount;
         System.out.println("Rs." + amount + " withdrawn from Current Account.");
     } else {
         System.out.println("Insufficient funds in Current Account.");
     }
 }
}

