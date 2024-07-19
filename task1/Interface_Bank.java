package task1;
import java.util.ArrayList;
import java.util.List;


public class Interface_Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank1 bank = new Bank1();
        Account1 savingsAccount = new SavingsAccount1();
        Account1 currentAccount = new CurrentAccount1();

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

       
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(200);
        System.out.println("Savings Account Balance: " + savingsAccount.viewBalance());
        System.out.println("Interest earned: " + savingsAccount.calculateInterest());

        currentAccount.deposit(5000);
        currentAccount.withdraw(1000);
        System.out.println("Current Account Balance: " + currentAccount.viewBalance());
        System.out.println("Interest earned: " + currentAccount.calculateInterest());
	}

}
interface Account1 {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double viewBalance();
}

class SavingsAccount1 implements Account1 {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public double calculateInterest() {
        return balance * 0.05;
    }

    @Override
    public double viewBalance() {
        return balance;
    }

    public void transferToFixedDeposit(double amount) {
        
    }
}

class CurrentAccount1 implements Account1 {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public double calculateInterest() {
        return 0; 
    }

    @Override
    public double viewBalance() {
        return balance;
    }

    public void issueOverdraft(double amount) {
        
    }
}

class Bank1 {
    private List<Account1> accounts;

    Bank1() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account1 account) {
        accounts.add(account);
    }
}


