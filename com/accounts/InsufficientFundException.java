package com.accounts;

public class InsufficientFundException extends Exception {
	
	public InsufficientFundException() {
		super("Insufficient funds in your account.");
	}
	
	public InsufficientFundException(String message) {
		super(message);
	}
	
	

}