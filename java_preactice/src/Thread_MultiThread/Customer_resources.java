
package Thread_MultiThread;


public class Customer_resources {
	
	//control the lock
	boolean transaction = false;
	private int amounts=10000;
	
	
	//consumer method
	public synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw...");
		if(!transaction) {
			System.out.println(transaction);
			
			if(this.amounts<amount) {
				System.out.println("Less balance; waiting for deposit...");
				System.out.println("Current balance: "+this.amounts);
				
				try {
					wait();
				} catch (InterruptedException e) {
				//TODO Auto-generated catch block
					
					e.printStackTrace();
				}
			}
		}
		
				System.out.println("withdraw completed with amount of: "+amount); 
				amounts -=amount;
				System.out.println("Current balnace: "+this.amounts);
				transaction=false;
				notify();
		
		
	}
		
	//producer method 
	public synchronized void deposit(int amount) {
		System.out.println("Going to deposit...");
		if(transaction) {
			
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println("deposit completed with amount of: "+amount); 
		amounts +=amount;
		System.out.println("Current balance: "+amounts);
		transaction=true;
		notify();
		
	}
	
	

}
