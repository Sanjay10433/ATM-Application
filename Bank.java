package com.oops.ATMApplication;

public class Bank {
	
	private User[] user;
	private Account[] account;
	
	Bank(){
		user = new User[2];
		account = new Account[2];
		
		user[0] = new User(1,"krishna",1234);
		user[1] = new User(2,"sanjay",5678);
		
		account[0] = new SavingsAccount(987654321,230987,user[0]);
		account[1] = new CuurentAccount(123456789,456743,user[1]);
			
	}
	 public User getUserById(int id) {
	     for(User u : user) {
	         if(u.getUserId() == id) { 
	        	 return u;
	         }
	     }
	     return null;
	 }

	 public Account getAccountByUser(User user) {
	     for(Account acc : account) {
	         if(acc.Owner == user) {
	        	 return acc;
	         }
	     }
	     return null;
	 }


}
