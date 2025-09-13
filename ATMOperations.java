package com.oops.ATMApplication;

public interface ATMOperations {
	
	void checkBalance();
	void deposit(double amount);
	void withdraw(double amount);
	void changePin(int oldPin, int newPin);

}
