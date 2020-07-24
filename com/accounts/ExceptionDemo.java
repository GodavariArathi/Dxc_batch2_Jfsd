package com.accounts;

public class ExceptionDemo {

	public static void main(String[] args) {

		Account acc = new Account();
	acc.deposit(0);
		try {
			acc.withdraw(6000);
		} catch (InsufficientFundException e) {
			System.out.println(e.getMessage());
		}

	}

}