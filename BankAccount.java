import java.util.Scanner;
interface IBankTransaction {
	public static final int amount = 0;
	public static final int balance = 10000;
	 
	void depositAmount();

	void withdrawAmount();

	void balanceCheck();
}

public class BankAccount {

		      public static void main(String[] args) {
		    	 
		            Scanner in = new Scanner(System.in);

		            char userChoice=in.next().charAt(0); ;
		            boolean quit = false;
					do {

						System.out.println("S. Saving Account");

		                  System.out.println("C. Current Account");

		                  System.out.println("B. Check balance");

		                  System.out.print("Your choice, 0 to quit: ");


		                  
						switch (userChoice) {

		                  case 'S' :
		                	     
		                	  class SavingAccount implements IBankTransaction {
		                		  
		                		  System.out.println("1. deposit amount");

				                  System.out.println("2.withdraw amount");

				                  System.out.println("3.  balance details");
				                  char op=in.next().charAt(0);
				                  switch (op)
                                  {
                                    case 1:
                                    	@Override
                                    	public void depositAmount() {
    		                				System.out.println("Deposit in Saving Account.");
    		                					

    		                			}
                                    	break;
                                 
                                  
                                  
                                  case 2:
		                			@Override
		                			public void withdrawAmount() {
		                				System.out.println("Withdraw from Saving Account.");
		                				break;     
		                			}
                                  case 3:
		                			@Override
		                			public void balanceCheck() {
		                				System.out.println("Balance in Saving Account");
                                           break;
		                			}
                                          
		                			

		                		}

		                	  }
		                       

		                  case 'C':
		                	  
		                	  
		                	  class CurrentAccount implements IBankTransaction {
		                		  char op1=in.next().charAt(0);
		                		  System.out.println("1. deposit amount");

				                  System.out.println("2.withdraw amount");

				                  System.out.println("3.  balance details");
				                  char ops=in.next().charAt(0);
				                  switch (ops)
                                  {
                                    case 1:
                                    	@Override
                                    	public void depositAmount() {
    		                				System.out.println("Deposit in Saving Account.");
    		                					

    		                			}
                                    	break;
                                 
                                  
                                  
                                  case 2:
		                			@Override
		                			public void withdrawAmount() {
		                				System.out.println("Withdraw from Saving Account.");
		                				break;     
		                			}
                                  case 3:
		                			@Override
		                			public void balanceCheck() {
		                				System.out.println("Balance in Saving Account");
                                           break;
		                			}
                                          
		                			
		                			
		                 
		                  case 'B':
                              int balance;
	                        System.out.println("Your balance: $" + balance);

	                        break;

	                  case 0:

	                        quit = true;

	                        break;
		                  default:

		                        System.out.println("Wrong choice.");

		                        break;

		                  }

		                  System.out.println();

		            } while (!quit);

		            System.out.println("Bye!");

	}

}
