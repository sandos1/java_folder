package Thread_MultiThread;

public class Inter_Threading {

	public static void main(String[] args) {
		/*final Customer_resources c=new Customer_resources();  
		new Thread(){  
		public void run(){c.withdraw(15000);}  
		}.start();  
		new Thread(){  
		public void run(){c.deposit(10000);}  
		}.start();  */
		
		
		Customer_resources c1= new Customer_resources();
		
		Thread t1 = new Thread(new Customer_Runnable(11000, c1));
		t1.start();
		
		Thread t2 = new Thread(new Customer_deposit(11000, c1));
		t2.start();
	}

}
