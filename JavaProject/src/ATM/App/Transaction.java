package ATM.App;

import java.util.Date;

/**
 * 
 * @author sandonasoro
 *
 */
public class Transaction {
	/**
	 * the amount of this transaction
	 */
	private double amount;
	/**
	 * the time and date of this transaction
	 */
	private Date timestamp;
	/**
	 * A memo for this transaction
	 */
	private String memo;
	/**
	 * the account in which the transaction was performed
	 */
	private Account inAccount;
	
	/**
	 * overloading Constructor with different parameter concept
	 * create a new transaction
	 * @param amount the amount transacted
	 * @param inAccount the account the transaction belong
	 */
	
	public Transaction(double amount, Account inAccount) {
		this.amount=amount;
		this.inAccount=inAccount;
		
		this.timestamp = new Date();
		this.memo=" ";
	}
	
	/**
	 *  
	 * overloading Constructor with different parameter concept
	 * create a new transaction
	 * @param amount the amount transacted
	 * @param inAccount the account the transaction belong
	 */
	
	public Transaction(double amount,String memo, Account inAccount) {
		// call the two-arg constructor first
		this(amount, inAccount);
		
		//set the memo
		this.memo = memo;
		
		}

	
	/**
	 * Get the amount of the transaction
	 * @return the amount
	 */
	public double getAmount() {
		// TODO Auto-generated method stub
		return this.amount;
	}

	/**
	 * Get a string summarizing the transaction
	 * @return the sammary string
	 */
	public String getSummaryline() {
		if(this.amount>=0) {
			
			return String.format("%s : $%.02f : %s", this.timestamp.toString(),this.amount,this.memo);
		}else {
			return String.format("%s : $(%.02f) : %s", this.timestamp.toString(),this.amount,this.memo);

		}
		
	}

}
