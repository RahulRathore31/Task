package task1;

public class Pojo_Bank {
	 private String accountNumber;
	    private double balance;

	    public String getAccountNumber() {
	        return accountNumber;
	    }

	    public void setAccountNumber(String accountNumber) {
	        this.accountNumber = accountNumber;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	   
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pojo_Bank account = new Pojo_Bank();
	        account.setAccountNumber("356200100148866");
	        account.setBalance(1000.0);

	        System.out.println("Account Number: " + account.getAccountNumber());
	        System.out.println("Balance: Rs." + account.getBalance());
	}

}
