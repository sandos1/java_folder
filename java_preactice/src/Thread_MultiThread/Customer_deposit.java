package Thread_MultiThread;

public class Customer_deposit implements Runnable{
	Customer_resources resources;
	private int amount;
	
	public Customer_deposit(int amount,Customer_resources resources) {
		
		this.amount=amount;
		this.resources=resources;
	}

	@Override
	public void run() {
		
		
		resources.deposit(amount);
	}
}
