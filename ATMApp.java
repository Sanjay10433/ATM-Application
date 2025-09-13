package com.oops.ATMApplication;

import java.util.Scanner;

public class ATMApp {

	public static void main(String[] args) {
		 Bank bank = new Bank();
	        ATM atm = new ATM(bank);
	        Scanner sc = new Scanner(System.in);

	        System.out.println("==== WELCOME TO ATM ====");
	        System.out.println("1. Login");
	        System.out.println("2. Forgot PIN");
	        int choice = sc.nextInt();

	        if (choice == 2) {
	            System.out.print("Enter User ID: ");
	            int uid = sc.nextInt();
	            atm.forgotPin(uid, sc);
	        } else if (choice == 1) {
	            System.out.print("Enter User ID: ");
	            int uid = sc.nextInt();
	            System.out.print("Enter PIN: ");
	            int pin = sc.nextInt();

	            if (atm.authenticateUser(uid, pin)) {
	                int options;
	                do {
	                    System.out.println("\n--- Menu ---");
	                    System.out.println("1. Check Balance");
	                    System.out.println("2. Deposit");
	                    System.out.println("3. Withdraw");
	                    System.out.println("4. Change PIN");
	                    System.out.println("5. Exit");
	                    options = sc.nextInt();
	                    switch (options) {
                        case 1 -> atm.checkBalance();
                        case 2 -> {
                            System.out.print("Enter amount: ");
                            atm.deposit(sc.nextDouble());
                        }
                        case 3 -> {
                            System.out.print("Enter amount: ");
                            atm.withdraw(sc.nextDouble());
                        }
                        case 4 -> {
                            System.out.print("Old PIN: ");
                            int oldP = sc.nextInt();
                            System.out.print("New PIN: ");
                            int newP = sc.nextInt();
                            atm.changePin(oldP, newP);
                        }
                        case 5 -> System.out.println("Goodbye!");
                        default -> System.out.println("Invalid choice!");
	                    }
	                } while (options != 5);
	            } else {
	                System.out.println("Invalid login!");
	            }
	        }
	        sc.close();




		

	}

}
