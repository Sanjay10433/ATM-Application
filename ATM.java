package com.oops.ATMApplication;

import java.util.Random;
import java.util.Scanner;

public class ATM implements ATMOperations{
	private Bank bank;
	private Account activeAccount;
	private User activeUser;
	
	public ATM(Bank bank) {
		this.bank = bank;
	}
	
	public boolean authenticateUser(int userId,int pin) {
		 //Fetch the user object from the bank using the userId
	    User user = bank.getUserById(userId);
	    
	    if(user != null && user.getPin() == pin) {
	    	activeUser = user;
	    	//set the active account for that user
	        activeAccount = bank.getAccountByUser(user);
	        System.out.println("Welcome" + user.getName());
	        return true;
	    	
	    }
	    return false;
		
	}
	
	//forgot pin
	public void forgotPin(int userId, Scanner sc) {
		User user = bank.getUserById(userId);
		
		if(user != null) {
			Random rand = new Random();
			int otp = 1000 + rand.nextInt(9999);
			
			System.out.println("Your OTP : " + otp);
			System.out.println("Enter OTP : ");
			int enteredOTP = sc.nextInt();
			
			if(enteredOTP == otp) {
				System.out.println("Enter new Pin : ");
				int newPIN = sc.nextInt();
				
				if(newPIN == user.getPin()) {
					System.out.println("New PIN cannot be same as old PIN");
				} else {
					user.setPin(newPIN);
					System.out.println("PIN reset successful");
				}
				
			}else {
				System.out.println("Incorrect OTP");
			}
		}
	}

	@Override
	public void checkBalance() {
		System.out.println("Balance : " + activeAccount.getBalance());
		
	}

	@Override
	public void deposit(double amount) {
		activeAccount.deposit(amount);
		//System.out.println("Deposited : " + amount);
		
	}

	@Override
	public void withdraw(double amount) {
		 activeAccount.withdraw(amount);

		
	}

	@Override
	public void changePin(int oldPin, int newPin) {
		 if (activeUser != null && activeUser.getPin() == oldPin) {
	            if (oldPin == newPin) {
	                System.out.println("New PIN cannot be same as old PIN!");
	            } else {
	                activeUser.setPin(newPin);
	                System.out.println("PIN changed successfully!");
	            }
	        } else {
	            System.out.println("Old PIN is incorrect!");
	        }

		
	}

}
