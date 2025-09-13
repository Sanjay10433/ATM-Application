package com.oops.ATMApplication;

public class User {
	private int userId;
	private String userName;
	private int pin;
	
	public User(int userId,String name,int pin) {
		this.userId = userId;
		this.userName = name;
		this.pin = pin;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public String getName() {
		return userName;
	}
	
	
	public void setPin(int newPin) {
		this.pin = newPin;
	}

	public int getPin() {
		return pin;
	}
	
	
	

}
