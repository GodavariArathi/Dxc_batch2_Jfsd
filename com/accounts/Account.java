package com.accounts;

package com.accounts;

public class Account {
	float balance;
	
	public Account() {
		this.balance = 5000;
	}

	public void deposit(float value) {
		if(value <= 0)
			throw new ArithmeticException();
		System.out.println("You have deposited : " + value);
	}
	
	public void withdraw(float value) throws InsufficientFundException {
		if(value > this.balance) {
			throw new InsufficientFundException("OOPS!! No funds to withdraw.");
		}
	}
}