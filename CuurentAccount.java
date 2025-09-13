package com.oops.ATMApplication;

public class CuurentAccount extends Account{

	public CuurentAccount(long accountNumber, double balance, User Owner) {
		super(accountNumber, balance, Owner);
//		System.out.println("Welcome!!!!" + "mr/mrs." + Owner);
//		System.out.println("Your Current Account Number : " + accountNumber);
//		System.out.println("Your current balance : " + balance);


	}

	@Override
	public void withdraw(double amount) {
		int min_bal = 1500;
		if(amount > min_bal && balance > amount) {
			balance = balance-amount;
			System.out.println("Successful!!!!Withdrawn amount : " + amount);
			System.out.println("your balance amount : " + balance);
		}else {
			System.out.println("Invalid input");
		}
		
	}

}
