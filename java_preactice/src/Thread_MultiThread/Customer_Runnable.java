package Thread_MultiThread;

public  class Customer_Runnable implements Runnable{
	
	Customer_resources resources;
	private int amount;
	
	public Customer_Runnable(int amount,Customer_resources resources) {
		
		this.amount=amount;
		this.resources=resources;
	}

	@Override
	public void run() {
		
		resources.withdraw(amount);
		
	
	}

}
