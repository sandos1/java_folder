package ATM.App;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/**
 * 
 * @author Sandona soro
 *
 */
public class User {
	/**
	 * User first name
	 */
	private String firstname;
	/**
	 * User last Name
	 */
	private String lastname;
	/**
	 * universal unique identifier
	 */
	private String uuid;
	/**
	 * the MD5 hash of the user's pin number
	 */
	private byte pinhash[];
	/**
	 * the list of accounts for the user.
	 */
	private ArrayList<Account> accounts;
	
	/**
	 * Create a new User
	 * @param firstname of user
	 * @param lastName of user
	 * @param pin number of user
	 * @param theBank object that user is a customer of
	 */
	
	public User(String firstname,String lastName, String pin, Bank theBank) {
		
		//set user's name
		this.firstname=firstname;
		this.lastname=lastName;
		
		//store the pin's MD5 hash rather than the original value, for security reasons.
		try {
			MessageDigest mDigest = MessageDigest.getInstance("MD5");
			this.pinhash= mDigest.digest(pin.getBytes());
		} catch (NoSuchAlgorithmException e) {
			System.err.println("error, caught NoSuchAlgorithmException");
			e.printStackTrace();
			System.exit(1);
		}
		
		//get a new unique universal ID for the user
		this.uuid = theBank.getNewUserUIID();
		
		//create empty list of account
		
		this.accounts = new ArrayList<Account>();
		
		//print the message
		System.out.printf("New user %s, %s with ID %s created.\n",lastName,firstname,this.uuid);
		
	}
	
	/**
	 * Add an account for the user
	 * @param account
	 */

	public void addAccount(Account account) {
		
		accounts.add(account);
		
	}
	
	/**
	 * 
	 * @return the firstname of the user
	 */
	
	public String getFirstname() {
		return firstname;
	}

	/**
	 * 
	 * @return the user's UUID
	 */
	public String getUUId() {
		
		return this.uuid;
	}
	
	/**
	 * Check whether a given pin match the true User pin
	 * @param pin
	 * @return
	 */

	public boolean validatepin(String pin) {
		
		try {
			MessageDigest mDigest = MessageDigest.getInstance("MD5");
			return MessageDigest.isEqual(mDigest.digest(pin.getBytes()), this.pinhash);
		} catch (NoSuchAlgorithmException e) {
			System.err.println("error, caught NoSuchAlgorithmException");
			e.printStackTrace();
			System.exit(1);
		}
		return false;
	}

	public void printAccountsSummary() {
		
		System.out.printf("\n\n%s's accounts summary", this.firstname);
		for(int a=0; a<this.accounts.size();a++) {
			System.out.printf("%d %s\n",a+1, this.accounts.get(a).getSummaryLine());
		}
		
		System.out.println();
	}

	
	/**
	 * Get the number of accounts of the user
	 * @return the number of accountsS
	 */
	public int numAccount() {
		// TODO Auto-generated method stub
		return this.accounts.size();
	}

	/**
	 * print transaction history for a particular account
	 * @param acctIndex  the index of the account to use
	 */
	public void printAcctTransactionHistory(int acctIndex) {
				
		this.accounts.get(acctIndex).printTransactionHistory();
	}

	/**
	 * Get the balance of a particular account
	 * @param acctIndex the index of the account to use
	 * @return  the balance of the account
	 */
	public double getAccountBalance(int acctIndex) {
		
		return this.accounts.get(acctIndex).getBalance();
	}

	
	/**
	 * Get the UUID of a particular account
	 * @param acctIndx  the index of the account to use
	 * @return  the uuid of the account
	 */
	public String getAccountUUID(int acctIndx) {
		// TODO Auto-generated method stub
		return this.accounts.get(acctIndx).getUUId();
	}

	
	/**
	 * Add a transaction to a particular account
	 * @param acctIdx the index of the account
	 * @param amount  the amount of the transaction
	 * @param memo     the memo of the transaction
	 */
	public void addAccountTransaction(int acctIdx, double amount, String memo) {
		
		this.accounts.get(acctIdx).addTransaction(amount,memo);
	}
	
	
	

}
