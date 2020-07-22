package com.polymorphism;

abstract class ABCBankAccount { 
		
		void showMessage() {
			System.out.println("Welcome to ABC Bank!!");
		}
	
	abstract void openAccount();

	abstract void closeAccount();

	}
	
	abstract class BankTransaction extends ABCBankAccount {
	
		public abstract void depositAmount();
	
	public abstract void withdrawAmount();
	
	public abstract void balanceCheck();
	}
	
	class SavingAccount extends BankTransaction {
	
		@Override
	public void depositAmount() {
			System.out.println("Deposit in SavingAccount");
		}
	
		@Override
		public void withdrawAmount() {
		System.out.println("Withdraw from SavingAccount");
	
		}
	
		@Override
		public void balanceCheck() {
		System.out.println("Balance in SavingAccount.");
	}
	
		@Override
	void openAccount() {
			System.out.println("Open Saving Account");
	
		}
	
		@Override
	void closeAccount() {
			System.out.println("Close Saving Account");
	
		}
	
	}
	
	class CurrentAccount extends BankTransaction {
	
		@Override
		public void depositAmount() {
			System.out.println("Deposit in CurrentAccount");
		}
	
		@Override
		public void withdrawAmount() {
			System.out.println("Withdraw from CurrentAccount");
	
		}
	
		@Override
	public void balanceCheck() {
			System.out.println("Balance in CurrentAccount.");
	
		}
			@Override
		void openAccount() {
			System.out.println("Open Current Account");
	
		}
	
		@Override
		void closeAccount() {
			System.out.println("Close Current Account");
	
		}
	
	}
	
	public class OverridingExample {
	
	public static void main(String[] args) {
	
			SavingAccount saving = new SavingAccount();
			saving.showMessage();
			saving.openAccount();
			saving.depositAmount();
		saving.withdrawAmount();
			saving.balanceCheck();
    saving.closeAccount();
	
			System.out.println("------------------------");
	
			CurrentAccount current = new CurrentAccount();
			current.openAccount();
			current.depositAmount();
			current.withdrawAmount();
			current.balanceCheck();
			current.closeAccount();
	
		}
	
	}

