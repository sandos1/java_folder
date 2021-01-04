package ATM.App;

import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * @author sandonasoro
 *
 */
public class Bank {
	
	private String name;
	private ArrayList<User> users;
	private ArrayList<Account> accounts;
	
	/**
	 * create a new Bank object with empty lists of users and accounts
	 * @param name of the banks
	 */
	
	public Bank(String name) {
		
		this.name=name;
		this.users = new ArrayList<User>();
		this.accounts= new ArrayList<Account>();
	}
	
	/**
	 * 
	 * @return uuid of each client
	 */
	public String getNewUserUIID() {
		// inits
		
		String uuid="";
		Random rnd = new Random();
		int len=6;
		boolean nonUnique;
		
		//continue looping until we get a unique ID 
		do {
			//generate the number
			for(int i=0; i<len;i++) {
				uuid += ((Integer)rnd.nextInt(10)).toString(); 
			}
			nonUnique=false;
			for(User u:this.users) {
				if(uuid.compareTo(u.getUUId())==0) {
					nonUnique=true;
					break;
				}
			}
			
		}while(nonUnique);
		
		
		return uuid;
	}


	/**
	 * 
	 * @return the uuid of each client Bank Account( like their banks account number)
	 */
	public String getNewAccountUIID() {
		// inits
		
		String uuid="";
		Random rnd = new Random();
		int len=10;
		boolean nonUnique;
		
		//continue looping until we get a unique ID 
		do {
			//generate the number
			for(int i=0; i<len;i++) {
				uuid += ((Integer)rnd.nextInt(10)).toString(); 
			}
			nonUnique=false;
			for(Account u:this.accounts) {
				if(uuid.compareTo(u.getUUId())==0) {
					nonUnique=true;
					break;
				}
			}
			
		}while(nonUnique);
		
		
		return uuid;
	}

	
	/**
	 * Create a new user of the bank
	 * @param firstname
	 * @param lastName
	 * @param pin
	 * @return
	 */
	public User addUser(String firstname,String lastName,String pin) {
		
		//create a new User object and add it to our list
		User newUser= new  User(firstname, lastName, pin, this);
		users.add(newUser);
		
		//create a saving Account
		Account savingAccount = new Account("Saving", newUser, this);
		
		//add to holder and bank lists
		newUser.addAccount(savingAccount);
		this.accounts.add(savingAccount); 
		return newUser;
	}
	/**
	 * Add an account to the Banks
	 * @param account
	 */

	public void addAccount(Account account) {
		
		accounts.add(account);
		
	}
	/**
	 * Get the User object associated with a particular userID and pin, if they are valid 
	 * @param userId  the UUID of the user to login
	 * @param pin     the pin of the user
	 * @return         the User Object, if the login is successful , or null if it is not
	 */
	public User userlogin(String userId, String pin) {
		
		//search through the list of users
		for(User u:this.users) {
			
			//check user ID is correct
			if(u.getUUId().compareTo(userId)==0 && u.validatepin(pin))  {
				return u;
			}
		}
		
		//if we have not found the user or have an incorrect pin
		return null;
		
	}
	
	/**
	 * 
	 * @return the name of the bank
	 */
	public String getName() {
		return this.name;
	}
}

