package Thread_MultiThread;

public class ConsumeThread extends Thread{
	// register resources to thread access
	//The synchronized keyword causes a thread to obtain a lock when entering the method,
	//so that only one thread can execute the method at the same time (for the given object 
	//instance, unless it is a static method).
	private int value;
	
	Resources resources; 
	public ConsumeThread(int value,Resources resources) {
		this.resources=resources;
		this.value=value;
		
			}
	
	public void run() {
		
		resources.paysalary(value);
	}

}
