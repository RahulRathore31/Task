package task1;

import java.util.Scanner;

public class BankAccount1 {

	public static void main(String[] args) {
		int choice;
		Account obj = new Account ();
		Scanner sc =new Scanner (System.in);
		System.out.print("Enter your choice:");
		choice=sc.nextInt();
		
		switch (choice) 
		{
		case 1: obj.AccountOpen();
		break;
		case 2: obj.Deposite();
		break;
		case 3: obj.Withdrawal();
		}

	}

}
class Account {
		String Name;
		long Adhar_number;
		long Pan_number;
		double Balance;
		
		public void AccountOpen () {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Name:");
			Name=sc.next();
			System.out.print("Enter Adhar Number:");
			Adhar_number=sc.nextLong();
			System.out.print("Enter your Pan Number:");
			Pan_number = sc.nextLong();
			System.out.print("Your account has been  successfully created.");
		}
		public void Deposite () {
			double Deposite_amount;
			Scanner sc1=new Scanner(System.in);
			System.out.print("Enter amount to deposite:");
			Deposite_amount = sc1.nextDouble();
			Balance +=Deposite_amount;
			System.out.println("Amount deposited and your current baoance is: Rs."+Balance);
			
		}

		public void Withdrawal () {
			double Withdrawal_amount;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter amount to withdraw :");
			Withdrawal_amount=sc.nextDouble();
			if ( Withdrawal_amount<=Balance ) {
				System.out.print("Your amount Rs."+Withdrawal_amount+"withdrawn");
				Balance -= Withdrawal_amount;
				System.out.println("Your current balance is Rs."+Balance);
			} else {
				System.out.println("Insufficient fund.");
			}
			
		}
}









