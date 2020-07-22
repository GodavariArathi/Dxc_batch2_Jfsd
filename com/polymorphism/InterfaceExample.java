package com.polymorphism;
interface IABCBankAccount {
	
	final int customerCount = 0;
	
	default void showMessage() {
		System.out.println("Welcome to ABC Bank!! (Default)");
	}
	
	static void displayMessage() {
		System.out.println("Welcome to ABC Bank!! (Static)");
	}

	void openAccount();

	void closeAccount();
}

interface IBankTransaction {

	void depositAmount();

	void withdrawAmount();

	void balanceCheck();
}

class SavingAccount implements IBankTransaction, IABCBankAccount {

	@Override
	public void depositAmount() {
		System.out.println("Deposit in Saving Account.");

	}

	@Override
	public void withdrawAmount() {
		System.out.println("Withdraw from Saving Account.");

	}

	@Override
	public void balanceCheck() {
		System.out.println("Balance in Saving Account");

	}

	@Override
	public void openAccount() {
		System.out.println("Open Saving Account");

	}

	@Override
	public void closeAccount() {
		System.out.println("Closing Saving Account");

	}

}

class CurrentAccount implements IBankTransaction, IABCBankAccount {

	@Override
	public void depositAmount() {
		System.out.println("Deposit in Current Account.");

	}

	@Override
	public void withdrawAmount() {
		System.out.println("Withdraw from Current Account.");

	}

	@Override
	public void balanceCheck() {
		System.out.println("Balance in Current Account");
	}

	@Override
	public void openAccount() {
		System.out.println("Open Saving Account");

	}

	@Override
	public void closeAccount() {
		System.out.println("Closing Saving Account");

	}
}

public interface InterfaceExample {

	public static void main(String[] args) {
		
		IABCBankAccount.displayMessage();

		SavingAccount saving = new SavingAccount();
		saving.showMessage();
		saving.openAccount();
		saving.depositAmount();
		saving.withdrawAmount();
		saving.balanceCheck();
		saving.closeAccount();

		System.out.println("------------------------");

		CurrentAccount current = new CurrentAccount();
		current.showMessage();
		current.openAccount();
		current.depositAmount();
		current.withdrawAmount();
		current.balanceCheck();
		current.closeAccount();
	}

}

