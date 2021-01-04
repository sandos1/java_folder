package ATM.App;

import java.util.ArrayList;

/**
 * 
 * @author sandona soro
 *
 */
public class Account {
	/**
	 * Account name: checking or saving
	 */
	private String name;
	
	/**
	 * the account ID number
	 */
	private String uuid;
	/**
	 * the user object that can owns this Account
	 */
	private User holder;
	/**
	 * the list of transactions for this account
	 */
	private ArrayList<Transaction> transactions;
	
	/**
	 * Create a new Account
	 * @param name of the Account 
	 * @param holder the User object that holds this Account
	 * @param theBank the bank that issues the account
	 */
	
	public Account(String name, User holder,Bank theBank) {
		
		//set the account name and holder name
		this.name=name;
		this.holder=holder;
		
		//get new account UUID
		this.uuid = theBank.getNewAccountUIID();
		
		// initialize transactions
		this.transactions = new ArrayList<Transaction>();
		
		
		
	}
	
	/**
	 * get Account Id
	 * @return the uuid of account
	 */

	public String getUUId() {
		return this.uuid;
	}
	
	/**
	 * Get summary line for the account
	 * @return the String summary
	 */

	public Object getSummaryLine() {

		//get the account's balance
		double balance = this.getBalance();
		
		//format the summary line, depending on the whether the balance is negative
		if(balance>=0) {
			return String.format("%s : $%.02f : %s", this.uuid,balance,this.name);
		}else {
			return String.format("%s : $(%.02f) : %s", this.uuid,balance,this.name);
		}
		
	
	}

	double getBalance() {

		double balance = 0;
		for (Transaction t: this.transactions) {
			balance +=t.getAmount();
		}
		
		return 0;
	}

	public void printTransactionHistory() {
		
		System.out.printf("\nTransaction history for Account %s", this.uuid);
		for(int t= this.transactions.size()-1; t>=0; t--) {
			System.out.printf("", this.transactions.get(t).getSummaryline());
		}
	}

	public void addTransaction(double amount, String memo) {
		
		//create new transaction and add it to our list
		Transaction newTransaction = new Transaction(amount, memo,this);
		transactions.add(newTransaction);
	}
}
