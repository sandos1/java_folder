package emailApp;

import java.util.Scanner;

public class Email {
	// instance variable
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity=500;
	private String alternateEmail;
	private String companySuffix = "iugb.edu";
	
	//constructor to receive the first name and last name
	public Email() {
		
	}
	
	
	public Email(String firstName, String lastname) {
		this.firstname= firstName;
		this.lastname= 	lastname;
		
		System.out.println("Email Created: "+ this.firstname+ " "+this.lastname);
		
		//Call a method asking for the department -- return department
		this.department = setDepatment();
		
		//call a method that generate a random password
		this.password = randomPassword(4);
		
		email= this.firstname.toLowerCase()+"."+this.lastname.toLowerCase()+"@"+this.department+"."+companySuffix;
		System.out.println("\nYour Email is: " + email);
	}
	
	
	
	//Ask for the department
	
	private String setDepatment() {
		System.out.print("DEPARTMENT CODE: \n\t1 for sales\n\t2 for Development\n\t3 for Accounting\n\t"
				+ "0 for none\nEnter the department: ");
		Scanner in = new Scanner(System.in);
		
		int  departmentChoice = in.nextInt();
		if(departmentChoice==1) {
			return "Sales";
		}
		 else if (departmentChoice==2) {
			return "Development";
		}
		 else if(departmentChoice==3) {
			 return "Accounting";
		 }else {
			 return " ";
		 }
	}
	
	//Generate a random Password

	private String randomPassword(int length) {
		
		String passwordset = "ABCDEFGHIJKLMNOPQRSTUVXWYZ0123456789!@#$%&*";
		char[] password = new char[length];
		
		for(int i=0; i<length; i++) {
			
			int rand = (int)(Math.random()*passwordset.length());
			password[i]= passwordset.charAt(rand);
		}
		
		return new String(password);
	}
	//set the mailbox capacity
	
	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}
	
	//change the password
	
	public void changePassword(String password) {
		this.password = password;
	}

	// set an alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail= altEmail;
	}
	
	//getter and setter method
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}


	public String getAlternateEmail() {
		return alternateEmail;
	}

	//toString method 
	
	@Override
	public String toString() {
		return "\nDISPLAY NAME: "+ firstname +" "+  lastname+ " \n\n"
				+ "Company Email: "+email+"\n\n"
				+"MAILBOX Capacity: "+ mailboxCapacity;
	}


	

	
}
