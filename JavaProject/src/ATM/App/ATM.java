package ATM.App;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		
		//init scanner
		
		Scanner sc = new Scanner(System.in);
		
		
		//init Bank
		Bank theBank = new Bank("Bank of America");
		
		
		//add a user, which also create a saving account
		User aUser = theBank.addUser("Sandona", "Soro", "1234");
		
		//add a checking account for our user
		
		Account newAccount = new Account("Checking",aUser ,theBank);
		aUser.addAccount(newAccount);
		theBank.addAccount(newAccount);
		
		
		User curUser;
		while(true){
			
			//stay in the login prompt until successful login
			curUser = ATM.mainMenuPrompt(theBank, sc);
			
			//stay in main menu until user quits
			ATM.printUserMenu(curUser, sc);
			
			
			
		}
		
		
		
		
	}
	
	
	
	

	/**
	 * print ATM's login menu
	 * @param bank  the bank object whose account to use
	 * @param sc    the Scanner object to use for user input
	 * @return      the authenticated User object
	 */

	public static User mainMenuPrompt(Bank bank,Scanner sc) {
		
		//inits
		String userID;
		String pin;
		User authUser;
		
		//prompt the user for user ID/pin combo till a correct one is reach
		
		do {
			System.out.printf("\n\nWelcome to %s\n\n", bank.getName());
			System.out.print("Enter User ID: " );
			userID = sc.nextLine();
			
			System.out.print("Enter User pin: " );
			pin = sc.nextLine();
			
			//try to get the user object corresponding to the ID and pin Combo
			authUser = bank.userlogin(userID, pin);
			if(authUser==null) {
				System.out.println("Incorrect User ID/pin combination. please try again");
			}
			
		}while(authUser==null);//continue looping until successful login
		
		
		return authUser;
	}

	
	public  static void printUserMenu(User curUser, Scanner sc) {
		//print the summary of the user's accounts
		curUser.printAccountsSummary();
		
		//init
		int choice;
		
		//user menu
		do {
			
			
			System.out.printf("Welcome %s, what would  you like to do?\n", curUser.getFirstname());
			System.out.println("  1) Show account transaction history");
			System.out.println("  2) Withdraw");
			System.out.println("  3) Deposit");
			System.out.println("  4) Transfer");
			System.out.println("  5) Quit");
			System.out.println();
			System.out.println("  Enter choice: ");
			choice = sc.nextInt(); 
			if(choice<1 || choice>5) {
				System.out.println("Invalid choice, please choose 1-5");
			}
		}while(choice<1 || choice>5);
		
		//process the choice
		switch (choice) {
		case 1: 
			ATM.showTransactionHistory(curUser, sc);
			break;
		case 2:
			ATM.withdrawFunds(curUser,sc);
			break;
		case 3: 
			ATM.depositFund(curUser,sc);
			break;
		case 4:
			ATM.transferFunds(curUser,sc);
			break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		
		//redisplay this menu unless the user wants to quit
		if(choice != 5) {
			
			// Recursion in java is a process in which a method calls itself continuously.
			//A method in java that calls itself is called recursive method.
			ATM.printUserMenu(curUser, sc);
		}
		
	}
	
	
	
	/**
	 * 
	 * @param theUser
	 * @param sc
	 */
	public static void showTransactionHistory(User theUser,Scanner sc) {
		
		int theAcct;
		
		//get account whose transaction history
		do {
			System.out.printf("Enter the number (1-%d) of the account whose transactions you want"
					+ "to see:  ", theUser.numAccount());
			
			theAcct= sc.nextInt()-1;
			if(theAcct<0 || theAcct>theUser.numAccount()) {
				System.out.println("Invalid account , please try again");
			}
		}while(theAcct<0 || theAcct>theUser.numAccount());
		
		//print the transaction history
		theUser.printAcctTransactionHistory(theAcct);
		
	}
	
	/**
	 * Process transferring funds from one account to another
	 * @param curUser    the logged in user object
	 * @param sc         the scanner object used for user input
	 */
	public static void transferFunds(User curUser,Scanner sc) {
		//inits
		int fromAcct;
		int toAcct;
		double amount;
		double acctbal;
		
		//get the account to transfer from
		do {
			System.out.printf("Enter the number (1-%d) of the account\n to transfer from: ");
			fromAcct= sc.nextInt()-1;
			if(fromAcct<0 || fromAcct>=curUser.numAccount()) {
				System.out.println("invalid account. please try again.");
			}
			
		}while(fromAcct<0 || fromAcct>=curUser.numAccount());
		acctbal = curUser.getAccountBalance(fromAcct);
		
		
		//get Account to transfer to 
		do {
			System.out.printf("Enter the number (1-%d) of the account\n to transfer from: ",curUser.numAccount());
			toAcct= sc.nextInt()-1;
			if(toAcct<0 || toAcct>=curUser.numAccount()) {
				System.out.println("invalid account. please try again.");
			}
			
		}while(toAcct<0 || toAcct>=curUser.numAccount());
		
		//get amount to transfer
		do {
			System.out.printf("Enter the amount to transfer (max $%.02f): $" , acctbal);
			amount=sc.nextDouble();
			if(amount<0) {
				System.out.println("Amount must be greater than Zero");
			} else if(amount>acctbal) {
				System.out.printf("Amount must be greater than balance"
						+ "of $%.02f.\n ",acctbal);
			}
		}while(amount<0 || amount>acctbal);
		
		//finally do the transfer
		curUser.addAccountTransaction(fromAcct,-1*amount,String.format("Transfer to account %s"
				+ "", curUser.getAccountUUID(toAcct)));
		
		curUser.addAccountTransaction(toAcct,amount,String.format("Transfer to account %s"
				+ "", curUser.getAccountUUID(fromAcct)));
	}
	
	
	/**
	 * Process a fund withdraw from an account
	 * @param curUser    the logged in user object
	 * @param sc         the scanner object used for user input
	 */
	private static void withdrawFunds(User curUser, Scanner sc) {
		//inits
		int fromAcct;
		double amount;
		double acctbal;
		String memo;
		
		//get the account to transfer from
		do {
			System.out.printf("Enter the number (1-%d) of the account\n to transfer from: ",curUser.numAccount());
			fromAcct= sc.nextInt()-1;
			if(fromAcct<0 || fromAcct>=curUser.numAccount()) {
				System.out.println("invalid account. please try again.");
			}
			
		}while(fromAcct<0 || fromAcct>=curUser.numAccount());
		acctbal = curUser.getAccountBalance(fromAcct);
		
		
		//get amount to transfer
		do {
			System.out.printf("Enter the amount to transfer (max $%.02f): $" , acctbal);
			amount=sc.nextDouble();
			if(amount<0) {
				System.out.println("Amount must be greater than Zero");
			} else if(amount>acctbal) {
				System.out.printf("Amount must be greater than balance"
						+ "of $%.02f.\n ",acctbal);
			}
		}while(amount<0 || amount>acctbal);
		
		//gobble up the rest of previous input
		
		sc.nextLine();
		
		//get a memo
		
		System.out.println("Enter a memo: ");
		memo = sc.nextLine();
		
		//do withdraw
		curUser.addAccountTransaction(fromAcct, -1*amount, memo);
	}

	/**
	 * Process a fund deposit from an account
	 * @param curUser    the logged in user object
	 * @param sc         the scanner object used for user input
	 */
	public  static void depositFund(User curUser, Scanner sc) {
		//inits
		int toAcct;
		double amount;
		double acctbal;
		String memo;
		
		
		//get Account to transfer from 
		do {
			System.out.printf("Enter the number (1-%d) of the account to deposit in : ",curUser.numAccount());
			toAcct= sc.nextInt()-1;
			if(toAcct<0 || toAcct>=curUser.numAccount()) {
				System.out.println("invalid account. please try again.");
			}
			
		}while(toAcct<0 || toAcct>=curUser.numAccount());
		acctbal = curUser.getAccountBalance(toAcct);
		//get amount to transfer
		do {
			System.out.printf("Enter the amount to transfer (max $%.02f): $" , acctbal);
			amount=sc.nextDouble();
			if(amount<0) {
				System.out.println("Amount must be greater than Zero");
			} else if(amount>acctbal) {
				System.out.printf("Amount must be greater than balance"
						+ "of $%.02f.\n ",acctbal);
			}
		}while(amount<0 || amount>acctbal);
		
		//gobble up the rest of previous input
		
		sc.nextLine();
		
		//get a memo
		
		System.out.println("Enter a memo: ");
		memo = sc.nextLine();
		
		//do withdraw
		curUser.addAccountTransaction(toAcct, amount, memo);
		
	}





	
	
	
	
	
	
	
}
