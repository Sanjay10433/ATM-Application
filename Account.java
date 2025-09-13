package com.oops.ATMApplication;

public abstract class Account {
	protected long accountNumber;
	protected double balance;
	protected  User Owner;
	
	public Account(long accountNumber,double balance,User Owner) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.Owner = Owner;
	}
	
	public double getBalance() {
		return balance;
	}
	
	void deposit(double amount) {
		if(amount > 0 && amount < 100000) {
		balance = amount + balance;
		System.out.println("Amount Deposited : " + amount);
		System.out.println("Deposit Successful!!! Total Balance : " + balance);
	   } else {
		   System.out.println("Invalid input");
	   }
	}
	
	//we have to give abstract so that we can override this in savings account.so, depends on the min balance we can withraw amount
	public abstract void withdraw(double amount);
	

}
